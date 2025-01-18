# List data structure

A list is a sequence of data which can either be sorted or unsorted so in cases where it is sorted it can also be called and ordered. Unsorted lists can also be called unordered. In any case, either ordered or unordered, the elements are ordered in a linear fashion therefore it is called linearly ordered lists. We say that because we have the first second, third, or even ith element in the list.

## List Operations

A basic list, as a data structure has some basic operations which include:

- List() - instantiates a new instance of the list class, called L
- L.insert(element) - inserting a data value into the list
- L.delete(element) - deleting a data value from the list
- L.sort() - sorting the list
- L.isEmpty() - is the size still zero?
- L.isFull() - is the size of the list equivalent to the list capacity?
- L.access(index) - access the element in the specified index value
- L.find(element) - finding element e from the list
- L.length() - returning the number of elements in the list
- L.concat(other list) - combining two list instances to make one

## Operation Running Times

Below we show the running times of some operations that can be implemented in the interface of a list

### Ordered List

| Operation         | Array Implementation | Linked Implementation |
| ----------------- | -------------------- | --------------------- |
| Stack()           | O(1)                 | O(1)                  |
| Insert(element)   | O(n)                 | O(n)                  |
| Delete(element)   | O(n)                 | O(n)                  |
| Sort()            | O(1)/O(n2)           | O(1)/O(n2)            |
| Find(element)     | O(logn)              | O(n)                  |
| Length()          | O(1)                 | O(n)                  |
| Access(index)     | O(1)                 | O(n)                  |
| Concatenate(list) | O(n)                 | O(n)                  |

### Unordered List

| Operation         | Array Implementation | Linked Implemenations |
| ----------------- | -------------------- | --------------------- |
| Stack()           | O(1)                 | O(1)                  |
| Insert(element)   | O(1)                 | O(1)                  |
| Delete(element)   | O(n)                 | O(n)                  |
| Sort()            | O(n2)                | O(n2)                 |
| Find(element)     | O(n)                 | O(n)                  |
| Length()          | O(1)                 | O(n)                  |
| Access(index)     | O(1)                 | O(n)                  |
| Concatenate(list) | O(1)                 | O(n)                  |

## List Implementation

Typically, there are two implementations of list data structure in Java and those are:

- Array-based Implementation

  Implements the list as an array with fixed number of elements it can handle and assume contiguous memory location. We also need to keep track of the size of the list and for it we need an additional variable, of integer type. We increment this variable whenever we add an element and decrement it whenever we delete an element from the list. It is important to note that you need to make the size 0 when we initiate an instance of the class.

  The advantage of this implementation is that we're going to require unit time to run most, not all, of the operations and this is due to the usage of the array mapping function which resolves the address of an element, the size which is know can can be retrieved with just a single statement, or any other reason.

- Linked-list Implementation

  These do not have a limit on the number of elements it can stored and each element is represented as a node which basically means we have a structure which stores two fields which are the data element and the pointer to the next node on the list. This does not assume contigous memory location. We have the head which is the first element in the list and the other important node is the tail which has a pointer pointing to null because we do not have anything else that follow.

## Note

As we have seen these two implementations may seem to differ but there are core functions that are basically the same so we require an interface when we are programatically implementing them. From the interface, the two classes classes can then inherit and implement the function body because the interface only defines the signature of each class method - which is the return type, function name, and the parameter list.

It is vital to note that each method must and should be implemented by the implemenation classes otherwise we are going to get errors when running our programs. These are abstract methods in other programming languages like python.

YOU NEED UNDERSTAND THE DIFFERENCE BETWEEN AN ORDERED AND AN UNORDERED LIST, THE RUNNING TIMES OF THE METHODS, AND WAYS TO IMPLEMENT THE LIST MODULE UNDER EACH CIRCUMSTANCE.
