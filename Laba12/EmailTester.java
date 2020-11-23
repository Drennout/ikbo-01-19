package Laba12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailTester {
    public static void main(String[] args) {
        String regex = "(\\w+)@(\\w+\\.)(\\w+)";

        String email = new Scanner(System.in).next();

        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(email);

        if (m1.matches())
            System.out.println("email is correct");
        else
            System.out.println("error, email isn't correct");
    }
}
