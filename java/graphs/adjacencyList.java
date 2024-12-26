import java.lang.reflect.Array;
import java.util.ArrayList;
import data_structures_and_algorithms.mygraph;

public class Node<T>{
    private T data;
    private ArrayList<T> adjacencyList;

    public Node (T nodeValue){
        this.data = nodeValue;
        this.adjacencyList = new ArrayList();
    }
    public Node(T data, ArrayList adjacencyList){
        this.data = data;
        this.adjacencyList = adjacencyList;
    }

    public void setData(T value){
        this.data = value;
    }
    public void setAdjacencyList(ArrayList adjacencyList){
        this.adjacencyList = adjacencyList
    }
    public T getData(){ return this.data; }
    public ArrayList<T> getAdjacencyList() { return adjacencyList; }
}


public class adjacencyListGraph<T> implements mygraph<T> {


    private ArrayList<Node> nodes;
    private ArrayList<T> nodeValues;

    // constructor
    public adjacencyListGraph(){
        this.nodes = new ArrayList();
        this.nodeValues = new ArrayList();
    }

    public int getSize(){ return this.nodes.size(); }
    public ArrayList<T> getNodeValues() {return this.nodeValues; }
    public boolean isEmpty() {
        // the graph is empty if the list containing the nodes has size of 0
        return (this.getSize() == 0);
        /*return this.nodes.isEmpty();*/
    }

    public boolean isMember(T u) {
        // A given value a member if there is a node in nodes which has data value
        // matching the given value or if the nodeIndex is not -1
        if (this.isEmpty()){
            return false;
        } else {
            /* return nodeIndex(u) != -1; */
            int index = 0;
            while (index < this.nodes.size()){
                if (this.nodes.get(index).getData() == u){
                    return true;
                index++;
            }
            return false;
        }
    }

    public boolean isAdjacent(T u, T v) {
        // v is adjacent to u if the adjacency list of u contains v
            // get the index of u and the adjacency list of u
            // if there is a node in the adjacency list of u with its value equals to v,
                // then v is adjacent to u
        if (!this.isEmpty()){
            if(this.isMember(u) && this.isMember()v){
                int indexU = this.nodeIndex(u);
                if(!(indexU == -1)){
                    ArrayList<T> adjlistU = this.nodes.get(indexU).getAdjacencyList();
                    if(adjlistU.contains(v)){
                        return true;
                    return false;
                }
            }
        }
    }

    public int nodeIndex(T u){
        // loop through the array list which contains the nodes
            // if you find a node if its data value similar to u,
                // then return the index
            // else return -1 to indicate that no index was found
        if (this.isEmpty()){
            return -1;
        } else {
            int index = 0;
            while(index < this.nodes.size()){
                if(this.nodes.get(index).getData() == u){
                    return index;
                index++;
            }
            return -1;
        }
    }

    public void addNode(T u){
        // we the node to both the nodes and nodeValues arrayLists
        if (!this.isMember(u)){
            Node p = new Node(u);
            this.nodes.add(p);
            this.nodeValues.add(u);
        }
    }

    public void removeNode(T u){
        int indexU = this.nodeIndex(u){
            if(!this.indexU == -1){
                this.nodes.remove(indexU);
            }
        }
    }

    public ArrayList<T> neighbours(T u) {
        if (!(this.isEmpty())){
            int indexOfU = nodeIndex(u);
            if (nodeIndex != -1){
                return (this.nodes.get(indexOfU).getAdjacencyList());
            }
        }
    }

    public void addEdge(T u, T v) {
=        if(!this.isEmpty()){
            if(this.isMember(u) && this.isMember(v)){
                int indexU = this.nodeIndex(u);
                if(indexU != -1){
                    ArrayList<T> adjListU = this.nodes.get(indexU).getAdjucencyList();
                    if(!(adjListU.contains(v))){
                        this.nodes.get(indexU).getAdjucencyList().add(v);
                    }
                }
            }
        }
    }

    public void removeEdge(T u, T v){
        if(!(this.isEmpty())){
            int indexU = this.nodeIndex(u);
            int indexV = this.nodes.get(indexU).getAdjacencyList().indexOf(v);
            if (indexU != -1){
                this.nodes.get(indexU).getAdjacencyList().remove(indexV);
            }
        }
    }

    public void showNodes(){
        for(int i = 0; i < this.getSize(); i++){
            System.out.printl(this.nodes.get(i).getData() + "\t");
        }
    }

    public void showEdges(){
        int index;
        for (int i = 0; i < this.nodes.size(); i++){
            Node p = this.nodes.get(i);
            for(int j = 0; j < this.nodes.get(i).getAdjacencyList().size(); j++){
                System.out.print("(" + p.getData() + ", "+ p.getAdjacencyList().get(j + ")"+ " "));
            }
            System.out.println();
        }
        System.out.println();
    }

    public void showGraph() {
        int index;
        for (int i = 0; i < this.getSize(); i++){
            Node p = this.nodes.get(i);
            System.out.print(p.getData() + "\t ===>");
            for(int j = 0; j < p.getAdjacencyList().size(); j++){
                System.out.print(+ p.getAdjacencyList().get(j).toString() + "\t"+ );
            }
            System.out.println();
        }
        System.out.println();
    }
}