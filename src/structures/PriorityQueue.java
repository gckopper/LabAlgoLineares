package structures;

/**
 * Priority Queue class based on a linked list  
 */
public interface PriorityQueue<T> {
    public void add(T element);
    public T remove();
}