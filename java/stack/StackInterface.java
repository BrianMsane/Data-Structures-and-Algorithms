public interface StackInterface<T> {
    boolean isEmpty();
    boolean isFull();
    void Push(T element); // add element to the top of the stack
    T Pop(); // remove and return the element at the top
    T Top(); // peek through the stack
    void showData();
}
