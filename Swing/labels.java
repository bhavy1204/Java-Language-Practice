package Swing;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class labels {
    public static void main(String args[]){

        // File file = new File("meow.png");
        // System.out.println("Path: " + file.getAbsolutePath());
        // System.out.println("Exists: " + file.exists());

        ImageIcon img = new ImageIcon("meow.png");
        // To create a border
        // Border b = BorderFactory.createTitledBorder("Title");
        Border b = BorderFactory.createLineBorder(Color.red, 7, true);
        // img.getImage()

        JLabel label = new JLabel();
        label.setText("This is my text ! ");
        
        // To add img to label
        label.setIcon(img);
        // Set border
        label.setBorder(b);

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.white);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setIconTextGap(30);
        label.setFont(new Font("MV Boli",Font.PLAIN,20));

        label.setVerticalAlignment(JLabel.CENTER);//Centers both img and text
        label.setHorizontalAlignment(JLabel.CENTER);//Centers both img and text

        label.setBounds(10, 20, 690, 680);

        // To set its positing in the frame 
        // label.setHorizontalTextPosition(JLabel.LEFT);//Left of img
        // label.setHorizontalTextPosition(JLabel.CENTER);//On the img (center)
        // label.setHorizontalTextPosition(JLabel.RIGHT);//right of img

        // To set vertical alignment 
        // label.setVerticalTextPosition(JLabel.TOP);//Same like horizontal but top bottom and center ! of img



        JFrame frame = new JFrame();
        frame.setVisible(true);
        // frame.setLayout(null);
        frame.setSize(700,700);
        frame.setTitle("Labels Practice ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // Adding label to the frame 
        frame.add(label);
    } 
}
