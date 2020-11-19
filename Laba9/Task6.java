package Laba9;

import java.util.Scanner;
import java.lang.Exception;

public class Task6 {
    public static void main(String[] args) {
        ThrowDemo6 td = new ThrowDemo6();
        td.getKey();

    }
}

class ThrowDemo6{
    public void printDetails(String key){
        try{
            String message = getDetails(key);
            System.out.println(message);
        }catch (Exception e){
            System.out.println("E exception is worked");
        }
    }

    public void getKey(){
        String key = new Scanner(System.in).next();
        printDetails(key);
    }

    private String getDetails(String key) throws Exception {
        if(key == "")
            throw new Exception("Key set to empty string");
        else
            return "data for " + key;
    }
}