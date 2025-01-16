
#include "Node.h";

template <class T>
class Queue {
    private:
        Node top;

    public:
        Queue(){top = nullptr;}
        Queue(T data){
            Node newNode = new Node(data);
            head = newNode;
        }
};