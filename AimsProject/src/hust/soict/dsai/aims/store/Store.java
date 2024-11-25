package hust.soict.dsai.aims.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    // List of DVDs available in the store
    private List<DigitalVideoDisc> itemsInStore;

    // Constructor
    public Store() {
        itemsInStore = new ArrayList<>(); // Initialize the list
    }

    // Add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        System.out.println("The DVD \"" + dvd.getTitle() + "\" has been added to the store.");
    }

    // Remove a DVD from the store
    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.remove(dvd)) {
            System.out.println("The DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
        } else {
            System.out.println("The DVD \"" + dvd.getTitle() + "\" was not found in the store.");
        }
    }

    // Display all DVDs in the store
    public void displayStore() {
        System.out.println("Items in the store:");
        for (DigitalVideoDisc dvd : itemsInStore) {
            System.out.println(dvd.toString());
        }
        System.out.println();
    }
}
