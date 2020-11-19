package Laba10;
import java.util.*;

public class Conversion <T>{

    public ArrayList<T> conversionToArrayList(T[] array){
        ArrayList<T> list = new ArrayList<>();

        for (T iter: array)
            list.add(iter);

        return list;
    }

    public LinkedList<T> conversionToLinkedList(T[] array){
       LinkedList<T> list = new LinkedList<>();

       for (T iter: array)
           list.add(iter);

       return list;
    }

    public Vector<T> conversionToVector(T[] array){
        Vector<T> list = new Vector<>();

        for (T iter: array)
            list.add(iter);

        return list;
    }

    public Stack<T> convertionToStack(T[] array){
        Stack<T> list = new Stack<>();

        for (T iter: array)
            list.add(iter);

        return list;
    }
}
