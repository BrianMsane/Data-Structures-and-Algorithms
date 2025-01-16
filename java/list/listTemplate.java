public interface listTemplate<T> {
    void insert(T element);
    void delete(T element);
    int length();
    T access(int index);
    int find(T element); // return the index
    void showData(); // traverse and print each element
    boolean isEmpty();
    boolean isFull();
}