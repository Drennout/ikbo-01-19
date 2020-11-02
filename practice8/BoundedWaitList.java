package practice8;

import java.util.ArrayList;

public class BoundedWaitList <E> extends WaitList<E>{
    private int capacity;

    BoundedWaitList(int capacity){
        this.capacity = capacity;
        list = new ArrayList<>(capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(Object element) {
        if (list.size() == capacity)
            return;
        else
            super.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", list=" + list +
                '}';
    }
}
