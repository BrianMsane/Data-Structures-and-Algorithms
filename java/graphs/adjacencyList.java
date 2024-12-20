import java.lang.reflect.Array;
import data_structures_and_algorithms.mygraph;

public class adjacencyList<T> implements mygraph<T>{

    public class Node<T>{
        private T data;
        private  Node<T> next;
        public Node (){
            this.data = null;
            this.next = null;
        }
        public Node(T data){
            this.data = data;
            next = null;
        }
    }

    private Node<T> node;
    private Array adjacentList;

    public static void main(String[] args) {
        System.out.println("Yeah we in it again");
    }
}