package Lab1;

import java.util.Scanner;

public class Factarial {
    static int factorial(int n){
        int res = 1;
        for (int i = 1; i <= n; i++)
            res *= i;
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("!" + n + " = " + Factarial.factorial(n));
    }
}
