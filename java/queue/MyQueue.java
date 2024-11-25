package data_structures_and_algorithms.java.queue;

public interface MyQueue {
    boolean isEmpty();
    boolean isFull();
    void enqueue(int e);
    int dequeue();
    int showData();
    int front();    
}