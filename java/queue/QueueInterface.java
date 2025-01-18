
public interface QueueInterface<T> {
    boolean isEmpty();
    boolean isFull();
    void Enqueue(T element);
    void Dequeue(); // remove element at the front and return it
    T Front(); // view element in the front
    T Rear(); // view element at the back/rear
}