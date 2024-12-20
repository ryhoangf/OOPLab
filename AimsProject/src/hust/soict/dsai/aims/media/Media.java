package hust.soict.dsai.aims.media;

import java.util.Objects;

public class Media {
    private static int idCounter = 0;
    private int id;
    private String title;
    private String category;
    private float cost;

    public Media(String title, String category, float cost) throws Exception {
        if (cost <= 0) {
            throw new Exception("Cost must be positive.");
        }
        this.id = ++idCounter;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Media)) {
            return false;
        }

        Media otherMedia = (Media) obj;
        return Objects.equals(this.title, otherMedia.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title); 
    }
}
