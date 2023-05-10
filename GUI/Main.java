package GUI;

import javax.swing.*;
import java.awt.*;

class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out of application
        frame.setSize(420, 420); // Sets the width and height.
        frame.setVisible(true);

        ImageIcon image = new ImageIcon(); // Create an image icon.
        frame.setIconImage(image.getImage()); // Change icon of the frame.

        frame.getContentPane().setBackground(new Color(123,50,250));
    }
}
