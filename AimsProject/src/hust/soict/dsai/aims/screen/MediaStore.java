package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.*;

import javax.swing.*;
import java.awt.*;

public class MediaStore extends JPanel {
    @SuppressWarnings("unused")
    private final Media media;
    @SuppressWarnings("unused")
    private final Cart cart; 

    @SuppressWarnings("unused")
    public MediaStore(Media media, Cart cart) { 
        this.media = media;
        this.cart = cart;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 16));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel(String.format("%.2f $", media.getCost()));
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton btnAddToCart = new JButton("Add to cart");
        btnAddToCart.addActionListener(e -> {
            try {
                cart.addMedia(media); 
                JOptionPane.showMessageDialog(this, media.getTitle() + " added to cart.");
                new CartScreen(cart); 
            } catch (LimitExceededException ex) {
                JOptionPane.showMessageDialog(this, "Cannot add more items: " + ex.getMessage(), "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        buttonPanel.add(btnAddToCart);

        if (media instanceof hust.soict.dsai.aims.media.Playable) {
            JButton btnPlay = new JButton("Play");
            btnPlay.addActionListener(e -> JOptionPane.showMessageDialog(this, "Playing " + media.getTitle()));
            buttonPanel.add(btnPlay);
        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(buttonPanel);
        this.add(Box.createVerticalGlue());
    }
}