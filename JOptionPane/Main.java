package JOptionPane;
import javax.swing.*;

class Main {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Do you want to launch nuclear armament?", "Title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Your computer has a VIRUS!!!", "Title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "CALL TECH SUPPORT NOW, OR...!", "Title", JOptionPane.ERROR_MESSAGE);

        //JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);

        //String name = JOptionPane.showInputDialog("What is your name?: ");
        //System.out.println("Hello, " + name);

        String[] responses = {"No, you're awesome!", "Thank you! :)", "*Blush*"};
        ImageIcon icon = new ImageIcon("like.png");
        JOptionPane.showOptionDialog(null,
                "You are awesome",
                "Secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses,
                0);



    }
}
