package Swing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Myframe extends JFrame {

    Myframe() {
        // Create a this
        // Jthis this = new Jthis();
        // Sets and fix size
        this.setSize(500, 500);
        this.setResizable(false);
        // Sets closing
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Sets title
        this.setTitle("My title");
        // Sets img
        ImageIcon img = new ImageIcon("meow.png");
        this.setIconImage(img.getImage());
        this.setVisible(true);

        // bgc color
        // this.getContentPane().setBackground(Color.BLUE);
        this.getContentPane().setBackground(new Color(123, 44, 32));
    }
}