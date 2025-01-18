# Queue Data Structue

A queue is an ordered, homogeneous list structure in which insertions are done at one end called the rear, deletions are done at other end called the front. It assumes the FIFO, first-in-first-out behaviour in the sense that the first element to be added to the queue is the first element to be removed.

Adding elements to a stack is and operation called enqueue, and deleting elements is an operation called dequeue. A perfect analogy used is one of a bank; customers in a bank stand on a queue and the first customer to arrive, is the first customer to be serviced and leave. New customers join the back of the line and they come closer as the customers at the front get serviced and leave.

## Queue Operations

- Queue() - Instantiates a new object of the queue class with all the properties/attributes and methods of the class in its interface.
- Enqueue(element) - Adds a new alement at the back of a queue, rear end.
- Dequeue() - removes the element that is at the front of the queue
- Front() - peeks, but don't delete, the front of the queue
- Rear() - peeks, but don't delete, the rear of the queue
- isEmpty() - check if the queue does not have element
- isFull() - check if the queue has reached its full capacity

## Running Time of Operations

| Operation        | Array Implementation | Linked implementation | Circular Array | Circular Linked |
| ---------------- | -------------------- | --------------------- | -------------- | --------------- |
| Queue()          | O(1)                 | O(1)                  | O(1)           | O(1)            |
| Enqueue(element) | O(1)                 | O(1)                  | O(1)           | O(1)            |
| Dequeue()        | O(n)                 | O(1)                  | O(1)           | O(1)            |
| Front()          | O(1)                 | O(1)                  | O(1)           | O(1)            |
| Rear()           | O(1)                 | O(1)                  | O(1)           | O(1)            |
| isEmpty()        | O(1)                 | O(1)                  | O(1)           | O(1)            |
| isFull()         | O(1)                 | O(1)                  | O(1)           | O(1)            |

We can observe that when we dequeue the data structure it actually take a lot of time to run the operation. This is due to the fact that when we remove the element at the front we need to shift all the other elements in the array towards the front. The front of the queue is said to be index 0.

We can optimize this by using a circurlar implementation where by we are not required to shift the elements each time we dequeue.

## Implementation

- Array-based implementation

  In this implementation, we're going to keep the elements in an array and we also need to keep track of the size of the list so we are required to have an additional variable of integer type which will be incremented each time we enqueue and element and decremented each time we dequeue the strucuture.

  As we know, this implmententation is really useful when we know ahead of time the number of elements we're going to keep otherwise we're prone to over-allocating or under-allocating memory addresses.

  We can add elements to the queue for as long as we still have space available otherwise we cannot. It is vital to note that the front of the queue is always suppossed to be index 0 so this means that whenever we dequeue we're going to remove the element in index 0. The next available element is then promoted to the front of the stack and this required us to shift all the elements to the subsequent position. This make the dequeue operation to take a lot of time to run; precisely, O(n).

- Linked implemenation

  This implementation takes advantage of the shortfall of the array implementation by ensuring that the queue can grow or shrink as per the needs of the underlying application. Theorectially, linked queue do not get full as they are not assigned contiguous memory blocks but each element, contained in Nodes, has the pointer to the next element in the structure and this allows for us to add more items as we want. Practically, though, the size of the Random Access Memory determines the size of this data structure.

  In terms of space complexity, this implementation is not optimal as we require space for:

  - the front pointer,
  - the rear pointer,
  - the data values,
  - and the pointer between nodes

- Circular array implementation

  We have seen from the array implementation that the need to shift elements requires additional time so one way to get around that is to keep the front and rear of the stack connected and then we have the queue in a circular fashion. It is vital to emphasize the process of enqueuing and dequeuing the array under this implementation.

  - Enqueue(element)

    - First check if the queue is not full, if it is then there is no space for storing the new data value, output a message and then exit the operation.
    - If it it not empty we need to calculate the rear which will give us the exact index position in which we need to enqueue the element. The formula for that is rear = (front + size) % capacity. We then insert the element at this position and then increment the size by 1

  - Dequeue()

    - First check if the queue is not empty, if it is then you have nothing to dequeue so output a message and exit the operation.
    - But if it is not empty, you need to calculate the front index and then we remove the element in that position, and decrement the size by one. The formula for calculating the front index is front = (front + 1) % capacity

- Circular linked implementation

  This implementation still uses pointer to link the nodes in the queue but with an additional condition that the front and the rear should always be connected. We connect the two by ensuring that the next node after the rear is the front and that implements the circular fashion. This needs to be done each time we enqueue and element.

## Note

THIS DATA STRUCTURE IS QUITE A DESCENT ONE IN AS FAR AS TIME COMPLEXITY ANALYSIS IS CONCERNED. MOST OF THE OPERATIONS TAKE UNIT TIME BESIDES FOR DEQUEUING WHEN WE ARE USING AN ARRAY IMPLEMENTATION.
