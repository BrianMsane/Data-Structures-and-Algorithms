# Stack Data Structure

A stack is a list of homogenous elements, of the same type, in which the addition and deletion of elements only occurs at one end called the <strong>TOP</strong> of the stack. To best exemplify this, we can visualize a stack of books. In a stack of books you only have access to the top; that means if you want to take a book you remove the one at the top until you get to the desired one. Also, you only add by putting the book at the top of the stack.

One important thing about stacks is that the elements are stored and retrieved using the last-in-first-out, LIFO, fashion which basically means that the last element to be added to the stack is the first one to be retrieved from the stack. Adding elements to a stack is an operation called <strong>push</strong>, and removing elements from a stack is one operation called <strong>pop</strong>. So to retrieve, but not delete, the element on the top of hte stack is an operation called <strong>top</strong>. So the basic operations that can be performed on the stack are as follows, not only these but the application scenario may define more:

## Stack Operations

- Stack() - constructor which creates an empty string
- S.push(T element) - operation to add element to a stack; T is the data type of the element
- S.pop() - deletes the element at the top of the stack
- s.top() - gets, but don't delete, teh element at the top of the stack
- s.isEmpty() -checks if the stack has no elements
- S.isFull() - checks if the stack is full

## Time Complexity Analysis

The stack data structure is one of the most efficient data structures and the running times or most core operations is unit time and below you can see each with it big-oh complexity analysis assuming worst case scenario.

| Operation | Array Implementation | Linked Implementation |
| --------- | -------------------- | --------------------- |
| Stack()   | O(1)                 | O(1)                  |
| Push(e)   | O(1)                 | O(1)                  |
| Pop()     | O(1)                 | O(1)                  |
| isEmpty() | O(1)                 | O(1)                  |
| isFull()  | O(1)                 | O(1)                  |
| Top()     | O(1)                 | O(1)                  |

## Stack Implementation

There are two main approaches that can be used to implement a stack and these are:

- Array-based Implementation

  When we use the array-based implementation, the data elements of the stack are stored in an array. As you know, an array needs to be initialized to hold a specific number of elements and when it has reached this capacity the stack is said to be full and we can no longer add more data to it. All elements are assigned to contiguous memory - meaning that the elements are stored next to each other starting from some base address.

  This implementation does not demand a lot of memory to hold the stack elements but in cases when we initialized the stack to have many spaces than we actually require we are going to inefficiently utilize memory. The main thing to take into consideration is that when you decide to use this implementation you should know ahead of time how many elements are going to be stored.

  To get an element, we make use of teh subscript operator which uses the array mapping function to go straight to the memory address of an element. This makes it optimal as it then takes O(1) to retrive elements from a stack. Also, to add elements to a stack you need to get the next available spcade as long as it is not full. The top is always the higher index position.

  On top of storing the elements on the array, we need a variable, of integer type, to keep track of the number of elements that are currently stored in the stack. Initially, on the constructor, this variable is set to zero and the more you add elements to the stack you increment it and the opposite is true for deleting elements; you decrement it.

- Linked- or pointer-based Implementation

  When using this implementation, we use a linked list but with an additional property that adding and removing elements is only done at one end. We use nodes to store data. Each node stores the data value and the pointer to the next node as the elements are not assigned contiguous memory. This actually means that this implementation requires more space to store the stack elements but it is still efficient for use when the stack size is not known prior to implementation as its size increases and shrinks as per your needs. Theoretically, the stack never gets full but practically it it your RAM that actually decides when the stack can no longer hold additional elements.

  Here there is a pointer which is called to top which points to the first node on the stack and each other node then points to the next node except for the last one as it points to null.

  Adding a value requires you to make a new node and then you make it to point to the node which was prevously the first node and then you make this new node the Top of the stack. On the contrary, to pop stack requires you to delink, or remove pointers, the first node on the stack, if it is not empty.

## Note

ALL OPERATIONS OF A STACK DATA STRUCTURE TAKES UNIT TIME TO RUN AND SO THIS MAKES IT AN EFFICIENT DATA STRUCTURE, BUT IN TERMS OF SPACE COMPLEXITY, YOU NEED TO CHOOSE THE OPTIMAL IMPLEMENTATION FOR THE UNDERLYING APPLICATION.
