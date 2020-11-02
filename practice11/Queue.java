package practice11;

public interface Queue<E> {
    E element();
    E poll();
    E peek();
    boolean add(E element);
}
