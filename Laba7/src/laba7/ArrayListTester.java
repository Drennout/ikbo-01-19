package laba7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTester {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter quantity elements");
        int num = new Scanner(System.in).nextInt();
        // add element into array list
        for (int i = 0; i < num; i++)
            arr.add(new Scanner(System.in).nextInt());

        //output each element of array list
        System.out.println("Output your array list");
        for(int i: arr)
            System.out.print(i + " ");

        System.out.println("\nEnter an element to find and remove ");
        int elem = new Scanner(System.in).nextInt();
        // check for elememt
        if(arr.contains(elem))
            System.out.println(arr.indexOf(elem) + " = index your element"); //search index element
        arr.remove(arr.indexOf(elem)); // delete element

        //output each element of array list
        System.out.println("Output update array list");
        for(int i: arr)
            System.out.print(i + " ");

        //delete by predicate
        System.out.println("\nEnter limited value");
        int lim = new Scanner(System.in).nextInt();
        arr.removeIf(i -> (i < lim));

        System.out.println("\nOutput array list" + arr.toString() + "Enter position and valuer for set element"); // output by toString method
        elem = new Scanner(System.in).nextInt();
        arr.set(new Scanner(System.in).nextInt(), elem);

        System.out.println("Output update array list");
        for(int i: arr)
            System.out.print(i + " ");

        // delete all array list
        arr.clear();
    }
}
