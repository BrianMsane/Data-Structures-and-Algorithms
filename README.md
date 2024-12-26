<h1>Data Structures and Algorithms</h1>

<p>
  In computer science, a data structure is a particular way of organizing and
  storing data in a computer so that it can be accessed and modified
  efficiently. More precisely, it is a collection of data values, relationships
  among them, and the operations that can be applied to the data. The operations
  should be applied in an efficient way. In data structures, efficiency is
  looked at from two perspectives, one is the efficient operations and the other
  is efficient storage of data values. The following are characteristics of data
  structures:
</p>

<ul>
  <li>Domain - set data values</li>
  <li>
    Structure - relationship among values which can either be linear or
    non-linear
  </li>
  <li>Operations - functions that can be done to access or modify the data</li>
  <li>Efficiency</li>
  <ul>
    <li>Efficient structure - requires minimal storage or memory</li>
    <li>Efficient operations - requires optimal time to process</li>
  </ul>
</ul>

<h2>For example</h2>
<p>
  If you have a linked list data structure which stores the marks of students in
  a class. The domain is the set of floating point numbers that is used to
  represent a mark. The structure is the linear structure which is represented
  by teh linked list implementation. There are quite a number of operations that
  can be done for instance:
</p>

<p></p>
<ul>
  <li>Insert(mark) -- inserts a mark on the data structure</li>
  <li>Delete(mark) -- removes the specified mark from the linked list</li>
  <li>Find(mark) -- finds the location of the given mark</li>
  <li>
    Traverse() -- visits all the marks/nodes in the linked list and process them
    somehow.
  </li>
</ul>
<p>
  In terms of efficiently we'd like to have optimal storage space required to
  store these data values and also have optimal running times of each operation
  or function performed on the values.
</p>

<h2>Internal and external data structures</h2>
<p>
  In computer science we have internal and external dada structures. Internal
  data structures deal with how data is stored and processed in primary memory,
  RAM. In contrast to this, external data structure are concerned with how data
  is stored and retrieved in secondary memory like Solid State Drives - SSDs.
</p>

<h2>Difference: Data types and Data structures</h2>
<p>
  It is important to note that there is a huge difference between data
  structures and data types.
</p>
<h3>Data types</h3>
<ul>
  <li>Atomic data types</li>
  <ul>
    <li>Character - char</li>
    <li>Integer - int</li>
    <li>Floating point numbers - float</li>
    <li>double</li>
  </ul>
  <li>Derived data types</li>
  <ul>
    <li>String</li>
    <li>Pointer</li>
    <li>Array</li>
    <li>Record or structs</li>
    <li>enum</li>
  </ul>
</ul>

<h3>Data structures</h3>
<ul>
  <li>Pre-defined data types</li>
  <ul>
    <li>Array</li>
    <li>Record</li>
  </ul>
  <li>User-defined data types</li>
  <ul>
    <li>List</li>
    <li>Stack</li>
    <li>Queue</li>
    <li>Tree</li>
    <li>Graph</li>
  </ul>
</ul>

<p>
  Note that lists, stacks, and queues are referred to as linear data structures
  while trees and graphs are referred to as non-linear data structures. The
  difference is that linear data structures have their elements arranged in a
  sequential fashion and each element has a direct link to its previous and/or
  next element. On the contrary, non-linear data structures are not arranged in
  a sequential manner.
</p>

<h2>Algorithm Analysis</h2>
<p>
  An algorithm is a step-by-step approach of solving a computational task. It is
  a description of how to perform a specific computational task. When analyzing
  algorithms, usually, the time and space complexities are used. Time complexity
  refers to the amount of time required to perform a task. Space complexity
  refers to the amount of memory space it requires to perform a specific
  computational task. Note that the best algorithm for a task requires minial
  space and optimal time to compute. Typically, worst-case time complexity is
  used. This is the maximum amount of time taken on inputs of a given size. It
  is generally expressed as a function of the size of inputs and the Big-Oh
  notation is widely used. The common running times in as far as Big-Oh is
  concerned are:
</p>
<ul>
  <li>Constant time</li>
  <li>Linear time</li>
  <li>Logarithmic time</li>
  <li>Quadratic time</li>
  <li>Cubic time</li>
  <li>Exponential time</li>
</ul>

<p>
  It is important to analyze algorithms so that the best one, as defined above,
  is adopted for a task.
</p>
