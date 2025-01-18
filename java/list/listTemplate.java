public interface ListTemplate<T> {
    void Insert(T element);
    void Delete(T element);
    int Length();
    T Access(int index);
    int Find(T element); // return the index
    void showData(); // traverse and print each element
    boolean isEmpty();
    boolean isFull();
    void Sort(String listType); // sorts the list elements
}