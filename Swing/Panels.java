package Swing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Panels {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setResizable(false);
        frame.setTitle("Hehehehe hahahahahhhahaha");
        ImageIcon logo = new ImageIcon("meow.png");
        frame.setIconImage(logo.getImage());
        frame.setVisible(true);
    }
}
