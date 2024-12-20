public class AdjacecyMatrixGraph<T> implements myGraph<T> {
    private final int size;
    private int [][] adjacencyMatrix;

    public AdjacecyMatrixGraph(int v){
        size = v;
        adjacencyMatrix = new int [size + 1][size + 1];
    }

    public int getSize(){ return this.size; }
    public int[][] getMatrix(){ return this.adjacencyMatrix; }
    public boolean isEmpty(){ return (this.size == 0); }
    // public boolean isFull(){this.size ==}

    public boolean isMember(T u) { return ((u >= 0 ) && (u <= size)); }
    public boolean isAdjacent(T u, T v){
        boolean found = false;
        if ((this.isMember(e)) && (this.isMember(v))){
            if (this.getEdge(u, v) == 1){
                found = true;
            }
        }
        return found;
    }

    public void addEdge(T from, T to){
        try{
            adjacencyMatrix[from][to] = 1;
        } catch{
            System.out.println("The nodes to add an edge to does not exist");
        }
    }

    public void getEdge(T from, T to){
        try{
            return adjacencyMatrix[from][to];
        }catch(ArrayIndexOutOfBoundsExeption index){
            System.out.println("The vertices does not exist")
            return;
        }
    }

    public void removeEdge(T from, T to){
        if((this.isMember(from)) && (this.isMember(to))){
            adjacencyMatrix[from][to] = 0;
        }
    }

    public void showGraph(){
        System.out.println("\t");
        for(int i =1; i < this.size; i++)
            System.out.println(i + "\t");
        System.out.println();

        for (int i = 1; i <= this.size; i++){
            System.out.println(i + '\t');
            for (int j = 1; j <= this.size; j++){
                System.out.println(this.getEdge(i, j));
            System.out.println();
            }
        }
    }
}