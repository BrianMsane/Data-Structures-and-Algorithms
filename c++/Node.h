
template <class T>
class Node {
    private:
        T data;
        Node *link;

    public:
    // constructor overloading
        Node(T data){
            data = data;
            link = nullptr;
        }
        Node(T data, Node next){
            data = data;
            link = next;
        }
}
