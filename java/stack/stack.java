package data_structures_and_algorithms.java.stack;

public interface stack<T> {
    boolean isEmpty();
    boolean isFull();
    void Push(T e);
    T Pop(); // remove and return the element at the top
    T Top(); // peek
}
