package practice6;

import java.util.Scanner;

public class Sort {
    static Scanner in = new Scanner(System.in);
    public static int[] sort(int[] arr){

        for (int l = 0; l < arr.length; l++) {
            int val = arr[l];
            int i = l - 1;
            for (; i >= 0; i--) {
                if (val < arr[i]) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i + 1] = val;
        }

        return arr;
    }

    public static void main(String[] args) {
        Student student = new Student(in.nextInt());
        student.setiDNumberElements();

        for (int i = 0; i < sort(student.getiDNumber()).length; i++)
            System.out.println(sort(student.getiDNumber())[i]);
    }
}

class Student{
    private int[] iDNumber;
    Student(int n){
        iDNumber = new int[n];
    }

    public void setiDNumber(int[] iDNumber) {
        this.iDNumber = iDNumber;
    }

    public void setiDNumberElements() {
        for (int i = 0; i < iDNumber.length; i++)
            iDNumber[i] = Sort.in.nextInt();
    }

    public int[] getiDNumber() {
        return iDNumber;
    }
}
