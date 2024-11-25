package hust.soict.dsai.aims;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.Cart;

public class Aims {

    public static void main(String[] args) {
        Cart anOrder = new Cart();

        // Create some DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);

        // Add individual DVDs to the cart
        anOrder.addDigitalVideoDisc(dvd1, dvd2);


        // Create a DVD array using existing DVDs
        DigitalVideoDisc[] dvdArray = { dvd1, dvd2, dvd3 };

        // Add multiple DVDs to the cart using an array
        anOrder.addDigitalVideoDisc(dvdArray);
                

        // Display cart contents
        anOrder.displayCart();

        // Demo of playing a DVD
        System.out.println("Playing a DVD:");
        anOrder.play(dvd1);

        // Search for DVDs by title
        DigitalVideoDisc[] searchResultsByTitle = anOrder.searchByTitle("Star Wars");
        System.out.println("Search results for 'Star Wars':");
        for (DigitalVideoDisc disc : searchResultsByTitle) {
            disc.displayInfo();
        }

        // Search for DVDs by cost
        DigitalVideoDisc[] searchResultsByCost = anOrder.searchByCost(20.00f);
        System.out.println("Search results for DVDs costing less than or equal to $20.00:");
        for (DigitalVideoDisc disc : searchResultsByCost) {
            disc.displayInfo();
        }

        // Remove a DVD and display cart contents again
        anOrder.removeDigitalVideoDisc(dvd2);
        anOrder.displayCart();
    }
}
