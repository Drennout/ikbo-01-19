package Laba9;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        ThrowDemo8 td = new ThrowDemo8();
        td.getKey();
    }
}

class ThrowDemo8{
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Key ");
        boolean correct = false;
        while(myScanner.hasNextLine()){
            String key = myScanner.nextLine();
            try {
                printDetails(key);
                correct = true;
            }catch (Exception e){
                System.out.println("Value isn't correct! Try again");
            }
        }

    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}