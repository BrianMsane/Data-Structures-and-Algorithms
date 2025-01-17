
#include "Node.h";
#define MAXSIZE 15

template <class Type>
class LinkedQueue {
    private:
        Node* front;
        Node* rear;

    public:
        Queue(): this->front(nullptr), rear(nullptr) {}
        Queue(Type data){
            Node newNode = new Node(data);
            head = rear = newNode;
        }

        bool isEmpty(){ return this->top == nullptr; }
        bool isFull(){ return false; }

        void enQueue(Type element){
            Node newNode = new Node<Type>(element);
            if(this->isEmpty){
                this->front = this->rear = newNode;
            } else {
                newNode->link = this->front->link;
                this->front = newNode;
            }
        }

        void deQueue(){
            this->front = this->front.link.link;
        }

        Type top(){
            if(!isEmpty())
                return this->front->data;
        }
};


template <class Type>
class ArrayQueue {
    private:
        int size;
        Type array[MAXSIZE];
    
    public:
        ArrayQueue(): size(0) {}

        bool isEmpty(){ return size==0; }
        bool isFull(){ return size == MAXSIZE; }

        void enQueue(element){
            
        }
};


template <class Type>
class CircularArrayQueue {

};


template <class Type>
class CircularLinkedQueue{

};
