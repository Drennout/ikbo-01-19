package practice9;

import java.util.ArrayList;
import java.util.Scanner;

public class LabClassUI  {
    //static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("input quantity of students");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Input mark and name");
            students.add(new Student(new Scanner(System.in).nextInt(), new Scanner(System.in).next()));
        }


        LabClass.sort(students, 0, students.size() - 1);

        System.out.println("Sort results:");
        for(Student it: students)
            System.out.println(it.getName());
        System.out.println("Input name of student which you want to check");

        try{
            System.out.println("Mark this student:");
            System.out.println(LabClass.searchByName(students, new Scanner(System.in).next()).getMatk());
        }
        catch (StudentNotFoundException e){
            e.printStackTrace();
        }
    }
}
