package Laba6;
import javax.swing.*;
import java.awt.*;
import java.awt.dnd.MouseDragGestureRecognizer;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AppSwing extends JFrame {

    private JPanel setBorderLayoutContex(String pos, Color col, String message){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.add(Box.createHorizontalGlue()); // alignment
        panel.add(new JLabel(pos));// add number lable into panel
        panel.add(Box.createHorizontalGlue());// alignment
        panel.setBackground(col); //set color
        panel.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseEntered(MouseEvent e){
                    JOptionPane.showMessageDialog(null,message);
                }
                @Override
                public void mouseClicked(MouseEvent e){}
                @Override
                public void mousePressed(MouseEvent e) {}
                @Override
                public void mouseReleased(MouseEvent e) {}
                @Override
                public void mouseExited(MouseEvent e) {}
        });
        return panel;
    }

    AppSwing(){
        super ("Application"); //Title name
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// if app is close, then exit from programm

        setLayout(new BorderLayout());
        // set context each part of border
        add(setBorderLayoutContex("Center", Color.GRAY, "Welcome to Center"), BorderLayout.CENTER);
        add(setBorderLayoutContex("West", Color.black, "Welcome to West"), BorderLayout.WEST);
        add(setBorderLayoutContex("South", Color.DARK_GRAY, "Welcome to South"), BorderLayout.SOUTH);
        add(setBorderLayoutContex("North", Color.lightGray, "Welcome to North"), BorderLayout.NORTH);
        add(setBorderLayoutContex("East", Color.white, "Welcome to East"), BorderLayout.EAST);

    }

    public static void main(String[] args) {
        new AppSwing().setVisible(true);
    }
}
