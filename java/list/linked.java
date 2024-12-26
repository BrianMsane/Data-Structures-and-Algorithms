package data_structures_and_algorithms.java.list;


public class linkedList<T> implements Innerlist<T> {

    // to get access to private attributes, it should be inside the class of interest
    public class Node<T> {
        private T data;
        private Node next;

        // constructor overloading
        public Node(T data, Node next){
            this.data = data;
            this.next = next;
        }
        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node last;

    public void linkedList(){
        // constructor initializes the head and last nodes to null
        this.head = this.last = null;
    }

    public boolean isEmpty() { return (this.head == null); }
    public boolean isFull(){ return false; } // never gets full, theoretically

    public boolean find(T e){
        if (!isEmpty()){
            current = head;
            while (current != null){
                if(current.data = e){
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    public void insert(T element){
        Node newNode = new Node(element);
        if(isEmpty()){
            this.head = this.tail = newNode;
        } else {
            newNode.next = this.head;
            head = newNode;
        }
    }

    public int indexOf(T e){
        int index = 0;
        if (isEmpty()){
            return -1;
        } else {
            current = head;
            while (current != null){
                if (current.data == e) return index;
                index++;
                current = current.next;
            }
        }
    }

    public void Delete(T e) {
        var current = this.head;
        Node prevNode = null;
        while(current != null){
            prevNode = current;
            current = current.next;
            if (current.data == e) {
                if (prevNode == null){
                    head = current.next;
                } else {
                    prevNode.next = current.next;
                }
            }
        }
    }

    public void showData() {
        Node currNode = this.head;
        while (currNode != null){
            System.out.print("\t"+ currNode.data);
            currNode = currNode.next;
        }
        System.out.println();
    }

    public int length(){
        // linked list traversal O(n)
        int count = 0;
        var current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public void addFirst(T e){
        // let this be the first element in the list
        Node tempNode = new Node(e);
        if(!(isEmpty())){
            tempNode.next = this.head;
            head = tempNode;
        } else {
            head = last = tempNode;
        }
    }

    public void addLast(T e){
        // add this element at the back of the list
        // when keeping track of the last node, the operation takes O(1)
        Node tempNode = new Node(e);
        if (!(isEmpty())){
            last.next = tempNode;
            last = tempNode;
        } else {
            head = tempNode;
        }
    }

    public void deleteLast(){
        if (isEmpty()){
            return -1;
        } else {
            current = head;
            while (current != null){
                previousNode = current;
                current = current.next;
                if(current.next == null){
                    previousNode.next = null;
                }
            }
        }
    }

    public void deleteFirst(){
        if (isEmpty()){
            return -1;
        } else {
            secondNode = head.next;
            head = secondNode;
        }
    }
}


public class UOListDemoApp { 
    public static void main(String[] args) { 
        MyList L<String> = new linkedList();
        L.Insert("brian");
        L.Insert("msane");
        L.Insert("kuhle"); 
        L.ShowData(); 
        L.Delete("kuhle");
        L.Delete("brian");
        L.ShowData();
    }
}
