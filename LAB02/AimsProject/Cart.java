import java.util.ArrayList;
import java.util.List;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private List<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

    // Add a DVD to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(disc);
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is full.");
        }
    }

    // Remove a DVD from the cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.remove(disc)) {
            System.out.println("The disc has been removed.");
        } else {
            System.out.println("The disc was not found in the cart.");
        }
    }

    // Calculate total cost of the DVDs in the cart
    public float totalCost() {
        float total = 0;
        for (DigitalVideoDisc disc : itemsOrdered) {
            total += disc.getCost();
        }
        return total;
    }

    // Play the given DVD
    public void play(DigitalVideoDisc disc) {
        if (itemsOrdered.contains(disc)) {
            disc.play();
        } else {
            System.out.println("The disc is not in the cart.");
        }
    }

    // Search for DVDs by title
    public DigitalVideoDisc[] searchByTitle(String title) {
        List<DigitalVideoDisc> foundDiscs = new ArrayList<>();
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc.getTitle().equalsIgnoreCase(title)) {
                foundDiscs.add(disc);
            }
        }
        return foundDiscs.toArray(new DigitalVideoDisc[0]);
    }

    // Search for DVDs by cost
    public DigitalVideoDisc[] searchByCost(float cost) {
        List<DigitalVideoDisc> foundDiscs = new ArrayList<>();
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc.getCost() <= cost) {
                foundDiscs.add(disc);
            }
        }
        return foundDiscs.toArray(new DigitalVideoDisc[0]);
    }

    // Search for DVDs by category
    public DigitalVideoDisc[] searchByCategory(String category) {
        List<DigitalVideoDisc> foundDiscs = new ArrayList<>();
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc.getCategory().equalsIgnoreCase(category)) {
                foundDiscs.add(disc);
            }
        }
        return foundDiscs.toArray(new DigitalVideoDisc[0]);
    }

    // Display the contents of the cart
    public void displayCart() {
        System.out.println("Cart Contents:");
        for (DigitalVideoDisc disc : itemsOrdered) {
            disc.displayInfo();
        }
        System.out.println("Total cost: $" + totalCost());
    }
}
