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
    JLabel lastScore = new JLabel("Last Score:N/A");
    JLabel winner = new JLabel("Winner:Draw");
    JButton goalMilan = new JButton("Press for goal AS Milan!");
    JButton goalReal = new JButton("Press for goal Real Madrid CF!");


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
        panel[4].setLayout(new BorderLayout());
        panel[4].add(lastScore, BorderLayout.NORTH);
        panel[4].add(winner, BorderLayout.CENTER);

        goalMilan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                score.setText("                       " + ++countMilan + " X " + countReal);
                lastScore.setText("Last Score: AC Milan");

                if(countReal > countMilan)
                    winner.setText("Winner:Real Madrid CF");
                else if (countMilan > countReal)
                    winner.setText("Winner:Milan");
                else
                    winner.setText("Winner:Draw");
            }
        });

        goalReal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                score.setText("                       " + countMilan + " X " + ++countReal);
                lastScore.setText("Last Score: Real Madrid CF");

                if(countReal > countMilan)
                    winner.setText("Winner:Real Madrid CF");
                else if (countMilan > countReal)
                    winner.setText("Winner:Milan");
                else
                    winner.setText("Winner:Draw");
            }
        });
    }

    public static void main(String[] args) {
        new Team().setVisible(true);
    }
}
