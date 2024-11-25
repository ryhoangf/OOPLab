package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
    private int id;

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    // Setter method for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Constructor chaining to reduce redundancy
    public DigitalVideoDisc(String title) {
        this(title, null, null, 0, 0.0f);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this(title, category, null, 0, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this(title, category, director, 0, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;

        // Increment the class variable and assign the unique ID
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Method to play the DVD
    public void play() {
        if (length > 0) {
            System.out.println("Playing DVD: " + title);
            System.out.println("DVD length: " + length + " minutes");
        } else {
            System.out.println("Cannot play DVD: " + title + " (invalid length)");
        }
        System.out.println();
    }

    // Method to display DVD info
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + (title != null ? title : "Unknown"));
        System.out.println("Category: " + (category != null ? category : "Unknown"));
        System.out.println("Director: " + (director != null ? director : "Unknown"));
        System.out.println("Length: " + (length > 0 ? length + " minutes" : "Unknown"));
        System.out.println("Cost: $" + (cost > 0 ? cost : "Unknown"));
        System.out.println();
    }
	// Method to return a formatted string representation of the DVD
    @Override
    public String toString() {
        return "DVD - " + title + " - " + (category != null ? category : "Unknown") +
               " - " + (director != null ? director : "Unknown") +
               " - " + (length > 0 ? length + " minutes" : "Unknown") +
               ": $" + cost;
    }

    // Method to check if the title matches (case-insensitive)
    public boolean isMatch(String title) {
        return this.title != null && this.title.equalsIgnoreCase(title);
    }
}
