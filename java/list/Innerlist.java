package data_structures_and_algorithms.java.list;

public interface Innerlist<T> {
    void Insert(T e);
    void Delete(T e);
    void showData();
    boolean isEmpty();
    boolean isFull();
}