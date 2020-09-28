package practice7;

import java.util.*;

public class Pasians {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Queue<Integer> player1 = new LinkedList<>(), player2 = new LinkedList<>();

        int stepPlayer1, stepPlayer2, count = 0;
        //input data
        for (int i = 0; i < 5; i++)
            player1.add(in.nextInt());
        for (int i = 0; i < 5; i++)
            player2.add(in.nextInt());
        while(!player1.isEmpty() && !player2.isEmpty()){
            if (count == 106){
                System.out.println("botva");
                break;
            }

            stepPlayer1 = player1.poll();
            stepPlayer2 = player2.poll();
            if(stepPlayer1 == 0 && stepPlayer2 == 9) {
                player1.add(stepPlayer1);
                player1.add(stepPlayer2);
            }
            if(stepPlayer2 == 0 && stepPlayer1 == 9) {
                player2.add(stepPlayer1);
                player2.add(stepPlayer2);
            }
            else if(stepPlayer1 > stepPlayer2){
                player1.add(stepPlayer1);
                player1.add(stepPlayer2);
            }
            else {
                player2.add(stepPlayer1);
                player2.add(stepPlayer2);
            }

            count++;
        }

        if(player1.isEmpty())
            System.out.println("second " + count);
        else if (player2.isEmpty())
            System.out.println("first " + count);
    }
}
