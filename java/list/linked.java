package data_structures_and_algorithms.java.list;


public class Node<T> {
    T data;
    Node next;

    // constructor overloading
    public Node(){}
    public Node(T data, Node next){
        this.data = data;
        this.next = next;
    }
    public Node(T data){
        this.data = data;
        this.next = null;
    }
}


public class linkedList<T> implements Innerlist<T> {

    public void MyArrayList(){
        // constructor initializes the head to null
        this.head = null;
    }

    @Override
    public boolean isEmpty() {
        // when the head still points to nothing, it is empty
        return (this.head == null);
    }

    public boolean isFull(){
        // never gets full, theoretically
        return false;
    }

    @Override
    public void Insert(T e) {
        Node<T> NewNode = new Node(e, this.head);
        this.head = NewNode;
    }

    @Override
    public void Delete(T e) {
        Node current = this.head;
        Node prevNode = null;

        while((current != null) && (current.data != e)){
            prevNode = current;
            current = current.next;
            if ((current != null) && (current.data == e)){
                if (prevNode == null)
                    head = current.next;
                else
                    prevNode.next = current.next;
            }
        }
    }

    @Override
    public void showData() {
        Node currNode = this.head;
        while (currNode != null){
            System.out.println("\t"+ currNode.data);
            currNode = currNode.next;
        }
        System.out.println();
    }

    public int length(){
        head = this.head;
        current = head;

        // linked list traversal
        int count = 0;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }
}

public class UOListDemoApp { 
    public static void main(String[] args) { 
        MyList<String> L = new linkedList();
        L.Insert("musa");
        L.Insert ("Lucky");
        L.Insert("jane"); 
        L.ShowData (); 
        L.Delete("Lucky");L.ShowData (); 
        L.Delete ("musa");L.ShowData ();
    }
}