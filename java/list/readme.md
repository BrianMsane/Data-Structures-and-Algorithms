# List data structure

A list is a sequence of data which can either be sorted or unsorted so in cases where it is sorted it can also be called and ordered. Unsorted lists can also be called unordered. In any case, either ordered or unordered, the elements are ordered in a linear fashion therefore it is called linearly ordered lists. We say that because we have the first second, third, or even ith element in the list.

## List Operations

A basic list, as a data structure has some basic operations which include:

- List() - instantiates a new instance of the list class, called L
- L.insert(element) - inserting a data value into the list
- L.delete(element) - deleting a data value from the list
- L.sort() - sorting the list
- L.isEmpty() - is the size still zero?
- L.isFull() - is the size of the list equivalent to the list capacity
- L.access(index) - access the element in the specified index value
- L.find(element) - finding element e from the list
- L.length() - returning the number of elements in the list
- L.concat(other list) - combining two list instances to make one

## Operation Running Times

Below we show the running times of some operations that can be implemented in the interface of a list

### Ordered List

| Operation         | Running Time |
| ----------------- | ------------ |
| Stack()           | O(1)         |
| Insert(element)   | O(1)         |
| Delete(element)   | O(n)         |
| Sort()            | O(1)         |
| Find(element)     |              |
| Length()          |              |
| Access(index)     |              |
| Concatenate(list) |              |

### Unordered List

| Operation         | Running Time |
| ----------------- | ------------ |
| Stack()           | O(1)         |
| Insert(element)   | O(1)         |
| Delete(element)   | O(n)         |
| Sort()            | O(1)         |
| Find(element)     |              |
| Length()          |              |
| Access(index)     |              |
| Concatenate(list) |              |

## List Implementation

Typically, there are two implementations of list data structure in Java and those are:

- Array-based Implementation

  Implements the list as an array with fixed number of elements it can handle and contiguous memory location. We also need to keep track of the size when implementing methods like isEmpty() or even length().

- Linked-list Implementation

  These do not have a limit on the number of elements it can stored and each element is represented as a node which basically means we have a structure which stores two fields which are the data element and the pointer to the next node on the list. This does not assume contigous memory location. We have the head which is the first element in the list and the other important node is the tail which has a pointer pointing to null because we do not have anything else that follow.

As we have seen these two implementations may seem to differ but there are core functions that are basically the same and we then use an interface when we are programatically implementing them. From the interface, the two classes classes can then inherit and implement the function body because the interface only defines the signature of each class method. It is vital to note that each method must and should be implemented by the implemenation classes otherewise we are going to get errors when running our programs.
