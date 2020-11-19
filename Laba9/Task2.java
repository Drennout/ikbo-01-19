package Laba9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        exception2.exeptionDemo();
    }
}


class Exception2{
    public void exeptionDemo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an int");
        String intString = in.next();
        try{
            int i = Integer.parseInt(intString);
            try{
                System.out.println(2/i);
            }catch (ArithmeticException e){
                System.out.println("Dividing by zero!");
            }
        }catch(NumberFormatException e){
            System.out.println("Format of number is invalid");
        }
    }
}