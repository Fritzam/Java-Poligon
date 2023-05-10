package GUI_Labels;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("dude.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel(); // Create a label.
        label.setText("Bro, do you even code?"); // Add text to a label.
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // Set text left, center or right of an image icon.
        label.setVerticalTextPosition(JLabel.TOP); // Set text top, center or bottom of an image icon.

        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("Calibri", Font.PLAIN, 20)); // Set font of text.
        label.setIconTextGap(5); // Set gap of text to an image.
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // Set vertical position of an icon + text in a label.
        label.setHorizontalAlignment(JLabel.CENTER); // Set horizontal position of an icon + text within a label.
        //label.setBounds(110, 85, 250, 280); // Set x, y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        //frame.setLayout(null);

        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
