public interface mygraph<T> {
    int getSize();
    public boolean isEmpty();
    public boolean isMember();
    public int nodeIndex(T node):

    public boolean isAdjacent();
    public void neighbours();

    public void addEdge(T u, T v);
    public void removeEdge(T u, T v);

    public void addNode(T node);
    public void removeNode(T node);

    public void showNodes();
    public void showEdges();
    public void showGraph(); 
} 