package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class CompareByTitleThenCost implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        int titleComparision = media1.getTitle().compareToIgnoreCase(media2.getTitle());
        if (titleComparision != 0) {
            return titleComparision;
        }
        return Float.compare(media1.getCost(), media2.getCost());
    }
}
