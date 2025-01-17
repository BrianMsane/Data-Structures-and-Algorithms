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
        ArrayStack(): size(0) {}

        bool isFull(){ return this->size == MAXSIZE; }
        bool isEmpty(){ return this->size == 0; }

        void push(Type element){
            if(!isFull()){
                this->array[this->size++] = element;
            }
        }

        void pop(){
            if(!isEmpty()) this->size--;
        }

        Type top(){
            if(!isEmpty()) return this->array[this->size - 1];
        }

        void showData(){
            int index = 0;
            while(index < this->size){
                std::cout << this->array[index];
            }
            std::endl;
        }
};


template <class Type>
class LinkedStack{
    private:
         Node<Type>* top;
    
    public:
        LinkedStack(): this->top(nullptr) {}

        bool isEmpty(){ return this->top == nullptr; }
        bool isFull(){ return false; }

        void push(Type element){
            Node<Type>* newNode = new Node<Type>(element);
            if(isEmpty()){
                this->top = newNode;
            } else {
                newNode->link = this->top.link;
                this->top = newNode;
            }
        }

        void pop(){
            if(!isEmpty()){
                this->top = this->top.link.link;
            }
        }

        Type top(){
            return this->top.data;
        }

        void showData(){
            if(!isEmpty()){
                Node<Type>* current = this->top;
                while(current != nullptr){
                    std::cout << current->data;
                }
                std::endl;
            }
        }
};
