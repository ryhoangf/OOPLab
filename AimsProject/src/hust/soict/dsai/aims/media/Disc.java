package hust.soict.dsai.aims.media;

public class Disc extends Media {
    private int length;
    private String director;

    public Disc(String title, String category, float cost, int length, String director) {
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void displayInfo() {
        System.out.println("Disc - " + getTitle() + " - " + getCategory() + " - Director: " + director
                + " - Length: " + length + " mins - Cost: $" + getCost());
    }
}