package practice8;
import java.util.Collections;

public class UnfairWaitList <E> extends WaitList<E>{

    UnfairWaitList(){
        super();
    }


    public void remove(E element) {
        if(list.indexOf(element) == 0)
            return;
        else
            list.remove(list.indexOf(element));
    }

    public void MoveToBack(E element){
        Collections.swap(list, list.indexOf(element), list.indexOf(list.size() - 1));
    }
}
