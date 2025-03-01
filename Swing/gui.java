package Swing;
import javax.swing.*;

public class gui {
    public static void main(String[] args) {
        int boardWidth=600;
        int boardHeight =boardWidth;

        JFrame f = new JFrame("MEOW");
        f.setVisible(true);
        f.setSize(boardWidth,boardHeight);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
