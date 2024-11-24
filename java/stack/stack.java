package data_structures_and_algorithms.java.stack;

public interface MyStack<T> {
    boolean isEmpty();
    boolean isFull();
    void Push(T e);
    void Pop();
    T Top();
    void showData();
}
