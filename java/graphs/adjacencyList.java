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

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isFull'");
    }

    @Override
    public boolean isMember() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isMember'");
    }

    @Override
    public boolean isAdjacent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isAdjacent'");
    }

    @Override
    public void neighbours() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'neighbours'");
    }

    @Override
    public void addEdge(T u, T v) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addEdge'");
    }

    @Override
    public void removeEdge(T u, T v) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeEdge'");
    }

    @Override
    public void showGraph() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showGraph'");
    }
    this.node = this.node;
    
}