public interface <T> myGraph {
    public boolean isEmpty();
    int getSize();
    public boolean isMember();
    public boolean isAdjacent();
    public void addEdge(T u, T v);
    public void removeEdge(T u, T v);
    public void showGraph();
}