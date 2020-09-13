package practice4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Team extends JFrame {
    int countMilan = 0, countReal = 0;
    JLabel asMilan = new JLabel("AS Milan");
    JLabel realMadrid = new JLabel("Real Madrid CF");
    JLabel score = new JLabel("                       0 X 0");
    JButton goalMilan = new JButton("Press for goal AS Milan!");
    JButton goalReal = new JButton("Press for goal Real Madrid CF!");

    JLabel l1 = new JLabel("lable 1");
    JLabel l2 = new JLabel("lable 2");
    JLabel l3 = new JLabel("lable 3");
    JLabel l4 = new JLabel("lable 4");
    JLabel l5 = new JLabel("lable 5");

    JPanel[] panel = new JPanel[6];

    Team(){
        super("Milan vs Real Madrid");
        setSize(600, 400);
        setLayout(new GridLayout(2,3));

        for(int i = 0; i < panel.length; i++){
            panel[i] = new JPanel();
            add(panel[i]);
        }

        panel[0].setLayout(new BorderLayout());
        panel[0].add(asMilan, BorderLayout.EAST);
        panel[1].setLayout(new BorderLayout());
        panel[1].add(score, BorderLayout.CENTER);
        panel[2].setLayout(new BorderLayout());
        panel[2].add(realMadrid, BorderLayout.WEST);
        panel[3].setLayout(new BorderLayout());
        panel[3].add(goalMilan, BorderLayout.NORTH);
        panel[5].setLayout(new BorderLayout());
        panel[5].add(goalReal, BorderLayout.NORTH);

        goalMilan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                score.setText("                       " + ++countMilan + " X " + countReal);
            }
        });

        goalReal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                score.setText("                       " + countMilan + " X " + ++countReal);
            }
        });
    }

    public static void main(String[] args) {
        new Team().setVisible(true);
    }
}
