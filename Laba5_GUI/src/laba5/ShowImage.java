package laba5;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class ShowImage extends JPanel {

    static Image img;
    ShowImage(String path){
        img = new ImageIcon(path).getImage();
    }
    public void paint(Graphics g){
        g.drawImage(img, 0, 0, null);
       // g.drawLine(20, 20, 200, 200);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String path = in.next();

        JFrame fr = new JFrame();
        fr.setSize(600, 600);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.add(new ShowImage(path));
        fr.setResizable(false);
    }
}
