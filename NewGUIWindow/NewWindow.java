package NewGUIWindow;

import javax.swing.*;
import java.awt.*;

class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello!");
    NewWindow() {

        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));

        frame.add(label);

        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(420,420);
        this.frame.setLayout(null);
        this.frame.setVisible(true);

    }

}
