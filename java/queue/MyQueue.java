package data_structures_and_algorithms.java.queue;

public interface MyQueue<T> {
    boolean isEmpty();
    boolean isFull();
    void enqueue(T e);
    T dequeue(); // remove element at the front and return it
    void showData();
    T queueFront(); // view element in the front
    T queueReat(); // view element at the back/rear
}