package Swing;

// import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panels {
    public static void main(String args[]){
        ImageIcon img = new ImageIcon("Mylogo.jpg");

        Image resizedImage = img.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH); // Resize to 50x50 pixels
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        JLabel label = new JLabel();
        label.setText("Hehahaha");
        label.setIcon(resizedIcon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setBounds(50,50,100,100);
        // pannels 
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,0,200,200);
        // greenPanel.setLayout(new BorderLayout());
        greenPanel.setLayout(null);
        greenPanel.add(label);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        yellowPanel.setBounds(200,0,200,200);
        // yellowPanel.setLayout(new BorderLayout());
        yellowPanel.setLayout(null);
        // yellowPanel.add(label);


        // Creating a basic frame 
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setResizable(false);
        frame.setTitle("Hehehehe hahahahahhhahaha");
        ImageIcon logo = new ImageIcon("meow.png");
        frame.setIconImage(logo.getImage());
        frame.setVisible(true);

        frame.add(greenPanel);
        frame.add(yellowPanel);

    }
}
