package MenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;
    MyFrame() {
        //Ustawienia okna
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("load.png");
        saveIcon = new ImageIcon("save.png");
        exitIcon = new ImageIcon("exit.png");

        //Instancja paska menu
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        //Generowanie elementów menu.
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        //Adding text to menu elements.
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        //Adding icons to menu elements.
        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        //Adding listeners to menu elements.
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt+F for file.
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt+E for edit.
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt+H for help.
        loadItem.setMnemonic(KeyEvent.VK_L); // L for load.
        saveItem.setMnemonic(KeyEvent.VK_S); // S for save.
        exitItem.setMnemonic(KeyEvent.VK_E); // E for exit.

        //JMenuItem UndoItem = new JMenuItem("Undo");
        //JMenuItem RedoItem = new JMenuItem("Redo");
        //JMenuItem ReplaceItem = new JMenuItem("Replace");


        //Dodawanie elementów menu do paska
        //editMenu.add(UndoItem);
        //editMenu.add(RedoItem);
        //editMenu.add(ReplaceItem);
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        this.setJMenuBar(menuBar);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loadItem) {
            System.out.println("You've loaded a file.");
        }
        if(e.getSource()==saveItem) {
            System.out.println("You've saved a file.");
        }
        if(e.getSource()==exitItem) {
            System.exit(0);
        }
    }
}
