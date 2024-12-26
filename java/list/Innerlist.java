package data_structures_and_algorithms.java.list;

public interface Innerlist<T> {
    void Insert(T element);
    void Delete(T element);
    int length();
    T access(index);
    int find(element);
    void showData();
    boolean isEmpty();
    boolean isFull();
}