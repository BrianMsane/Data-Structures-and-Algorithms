#include <iostream>
#include "Node.h"
#define MAXSIZE 15

/*
OPERATIONS
==========
1. Push(element) -> add an element to the top of the stack
2. Pop() -> removes or deletes the element at the top of the stack
3. Top() -> peeks at the top of the stack but do not delete the element there
4. isFull() -> check if the data structure has reached its full capacity
5. isEmpty() -> check if there are no elements in the stack
*/

template <class Type>
class ArrayStack{
    private:
        Type array[MAXSIZE];
        int size;

    public:
        ArrayStack(){ size = 0; }
        bool isFull(){ return this == MAXSIZE; }
        bool isEmpty(){ return size == 0; }

        void push(Type element){
            if(!isFull()){
                array[size++] = element;
            }
        }

        void pop(){
            if(!isEmpty()){
                delete array[size--];
            }
        }

        Type top(){
            if(!isEmpty()){
                return array[size];
            }
        }
};


template <class Type>
class LinkedStack{
    private:
        Node top;
    
    public:
        LinkedStack(){ top=nullptr; }

        bool isEmpty(){ return top == nullptr; }
        bool isFull(){ return false; }

        void push(Type element){
            Node newNode = new Node(element);
            if(isEmpty()){
                top = newNode;
            } else {
                newNode.link = top.link;
                top = newNode;
            }
        }

        void pop(){
            if(!isEmpty()){
                top = top.link.link;
            }
        }

        Type top(){
            return top.data;
        }
};
