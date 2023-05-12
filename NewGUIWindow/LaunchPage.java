package NewGUIWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");

    LaunchPage() {
        myButton.setBounds(100, 160, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.add(myButton);

        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(420,420);
        this.frame.setLayout(null);
        this.frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==myButton) {
            frame.dispose();
            NewWindow myWindow = new NewWindow();
        }
    }
}
