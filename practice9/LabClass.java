package practice9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LabClass {
    public static void sort(ArrayList<Student> arr, int l, int h){
        if(arr.size() == 0)
            return;

        if(l >= h)
            return;

        int middle = l + (h-l)/2;
        Student midElem = arr.get(middle);

        int i = l, j = h;
        while (i<=j){
            while (arr.get(i).getMatk() < midElem.getMatk())
                i++;
            while (arr.get(j).getMatk() > midElem.getMatk())
                j--;
            if(i <= j){
                Collections.swap(arr, i, j);
                i++;
                j--;
            }
        }

        if(l < j)
            sort(arr, l, j);
        if(h > i)
            sort(arr, i, h);
    }

    public static Student searchByName(ArrayList<Student> arr,String name){
        for (int i = 0; i < arr.size(); i ++) {
            if (arr.get(i).getName().equals(name))
                return arr.get(i);
        }
        throw new StudentNotFoundException("Not Found");
    }
}
