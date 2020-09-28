package practice5;

import java.util.Scanner;

public class Recursion {
    public static void digit(int n){
        int k;
        if (n/10 == 0)
            System.out.print(n + " ");
        else{
            k = n/10;
            n%=10;
            digit(k);
            digit(n);
        }
    }

    public static void AtoB(int a, int b){
        if (++a != b) {
            System.out.print(a + " ");
            AtoB(a, b);
        }
    }

    public static int sum (int a){
       if(a < 10)
           return a;
       else return (a%10) + sum(a/10);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        digit(in.nextInt());
        System.out.println();

        AtoB(in.nextInt(), in.nextInt());
        System.out.println();

        System.out.println(sum(in.nextInt()));
    }
}
