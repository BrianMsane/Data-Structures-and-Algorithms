# Data Structures and Algorithms

In computer science, a data structure is a particular way of organizing and storing data in a computer so that it can be accessed and modified efficiently. More precisely, it is a collection of data values, relationships among them, and the operations that can be applied to the data. The operations should be applied in an efficient way. In data structures, efficiency is looked at from two perspectives, one is the efficient operations and the other is efficient storage of data values. The following are characteristics of data structures:

- Domain - set of data values
- Structure - relationship among values which can either be a linear or non-linear one
- Operations - functions or methods that can be used to access or modify the data values
- Efficiency - it is defined fromt eh perspective of a strucuture and opearions.

  - Efficiency structure - requires minimal storage or memory to store the data values
  - Efficiency operations - requires minimal time to process

## For Example

If you have a linked list data structure which stores the marks of students in
a class. The domain is the set of floating point numbers that is used to
represent a mark. The structure is the linear structure which is represented
by teh linked list implementation. There are quite a number of operations that
can be done for instance:

- Insert(mark) -- inserts a mar on the data structure
- Delete(mark) -- removes the specified mark fromt the list
- Find(mark) -- finds the location or index of the mark
- Traverse() -- visits and process all marks in the linked list

In terms of efficiently we'd like to have optimal storage space required to store these data values and also have optimal running times of each operation or function performed on the values.

## Internal and external data structures

In computer science we have internal and external dada structures. Internal data structures deal with how data is stored and processed in primary memory, RAM. In contrast to this, external data structure are concerned with how data is stored and retrieved in secondary memory like Solid State Drives - SSDs.

## Difference: Data types and Data structures

It is important to note that there is a huge difference between data
structures and data types.

### Data types

- Atomic data types

  - char
  - int
  - float
  - double

- Derived data types

  - string
  - array
  - pointer
  - struct
  - enum

### Data structures

- Pre-define data structures

  - Array
  - Record

- User-defined data structures

  - List
  - Stack
  - Queue
  - True
  - Graph

Note that lists, stacks, and queues are referred to as linear data structures while trees and graphs are referred to as non-linear data structures. The difference is that linear data structures have their elements arranged in a sequential fashion and each element has a direct link to its previous and/or next element. On the contrary, non-linear data structures are not arranged in a sequential manner.

## Algorithm Analysis

An algorithm is a step-by-step approach of solving a computational task. It is a description of how to perform a specific computational task. When analyzing algorithms, usually, the time and space complexities are used. Time complexity refers to the amount of time required to perform a task. Space complexity refers to the amount of memory space it requires to perform a specific computational task. Note that the best algorithm for a task requires minial space and optimal time to compute. Typically, worst-case time complexity is
used. This is the maximum amount of time taken on inputs of a given size. It is generally expressed as a function of the size of inputs and the Big-Oh notation is widely used. The common running times in as far as Big-Oh is concerned are:

- constant time
- linear time
- logarithmic time
- quadratic time
- cubic time
- exponential time
- etc

It is important to analyze algorithms so that the best one, as defined above, is adopted for a task.
