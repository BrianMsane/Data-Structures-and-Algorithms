public interface mygraph<T> {
    public boolean isEmpty();
    public boolean isFull();
    public boolean isMember();
    public boolean isAdjacent();
    public void neighbours();
    public void addEdge(T u, T v);
    public void removeEdge(T u, T v);
    public void showGraph(); 
} 