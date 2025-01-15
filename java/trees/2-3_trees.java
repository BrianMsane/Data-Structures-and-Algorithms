class Node<T> {
    T firstData;
    T secondData;
    Node middlePointer;
    Node leftPointer;
    Node rightPointer;

    public Node(T first, T second){
        this.firstData = first;
        this.secondData = second;
    }
    public Node(T first){
        this.firstData = first;
    }
}