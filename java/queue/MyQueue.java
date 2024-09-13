package data_structures_and_algorithms.java.queue;

public interface MyQueue {
    public boolean isEmpty();
    boolean isFull();
    public void enqueue(int e);
    public int dequeue();
    public int showData();
    public int front();    
}