package practice8;

import java.util.ArrayList;
import java.util.Collection;

public class WaitList <E> implements IWaitList{
    ArrayList <E> list;
    int index;
    public WaitList(){
        list = new ArrayList<E>();
    };

    public WaitList(Collection<E> c){
        list = (ArrayList<E>) c;
    };

    @Override
    public String toString(){
        return list.toString();
    }

    @Override
    public void add(Object element) {
        list.add((E)element);
    }

    @Override
    public E remove() {
        return list.remove(index);
    }

    @Override
    public boolean contains(Object element) {
        if(list.contains(element))
            return true;
        else
            return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return list.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
