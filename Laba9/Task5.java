package Laba9;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        ThrowsDemo5 td = new ThrowsDemo5();
        td.getDetails(null);
    }
}

class ThrowsDemo5{
    public void getDetails(String key){
        try {
            if(key == null){
                throw new NullPointerException("null key in getDetails");
            }
        }catch (NullPointerException e){
            System.out.println("null key in getDetails");
        }

    }
}