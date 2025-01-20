class Node {
    int firstData;
    int secondData;
    Node middlePointer;
    Node leftPointer;
    Node rightPointer;

    public Node(int first, int second){
        this.firstData = first;
        this.secondData = second;
    }
    public Node(int first){ this.firstData = first; }
    public Node(){}
}