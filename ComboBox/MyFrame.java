package ComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JComboBox comboBox;
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        //Do boxa trzeba podać tablicę referencyjncyh typów danych, lub prymitywne we wrapperach.
        String[] animals = {"dog", "cat", "bird"};
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        //comboBox.setEditable(true); // Umożliwi modyfikacje elementów boxa.
        //System.out.println(comboBox.getItemCount()); //Wyświetli liczbę elementów boxa.
        //comboBox.addItem("horse"); //Wstawi element "horse" do boxa.
        //comboBox.insertItemAt("pig", 0); //Wstawi element "pig" do boxa na indexie 0.
        //comboBox.setSelectedIndex(0); // Domyślnie wybiera element na indexie 0.
        //comboBox.removeItem("cat"); // Usuwa z boxa element "cat".
        //comboBox.removeItemAt(0); // Usuwa element na indexie 0.
        comboBox.removeAllItems(); // Usuwa wszystkie elementy boxa.

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox) {
            //System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());

        }
    }
}
