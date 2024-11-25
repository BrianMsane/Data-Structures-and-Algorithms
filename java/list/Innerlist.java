package data_structures_and_algorithms.java.list;

public interface Innerlist<T> {
    void Insert(T e);
    void Delete(T e);
    void showData();
    void sort(String order); // ascending or descending (ORDERED and UNORDERED)
    boolean isEmpty();
    boolean isFull();
}