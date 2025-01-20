# Arrays

An array is a homogenous collection - of the same type, of data values which
are stored contiguously in memory.

## Important concepts

- The subscript operator, [], is used to reference to an element at a specified index
- Index start at 0 for C-style languages like Python, Java, C++.
- For other languages allow for any range of values, eg, Pascal
- We can have any dimension of array eg, one dimensional, multidimensional
- The major limitation is the fixed size which is specified when the array is
  declared. You cannot change it once it is declared.
- They can be sorted or unsorted. If sorted, deleting and inserting operation
  require that you shift the elements which can be costly; unsorted arrays
  give the freedom to add and delete elements at the end which takes O(1)

## Operations

Depending on the use case, you can define many other operations but the core
operations on arrays include the following.

<ul>
  <li>Insert(element) > O(1)</li>
  <li>Delete(element) > O(n)</li>
  <li>Traverse() > O(n)</li>
  <li>Sort(ascending | descending) > O(n)</li>
  <li>Search(element) > O(n)</li>
</ul>

## Memory Allocation for Elements

Array values are assigned to consecutive memory in memory, starting from a
base address, b. The size of the data type is mainly used to determine the
number of bytes the values are going to require. For instance, integers
require four bytes and this can be determined using the
<strong>sizeof()</strong> operator in C++

For example if we have an array, one-dimensional, of size four and a base
address of 500. The values are then stored in 500, 504, 508, 512.

The array mapping function, AMF, can be used to return the memory address of a
value at a given index position in an array given the index itself, and the
base address. Let A[lo..hi] be a 1-DIM array. The AMF can be denoted as
follows:

<strong>Addr(A[i]) = b + (i - lo) \* E.size</strong>.

This simply means that the address of the element at index position i is the
sum of the base address and all the memory allocated before the ith element.

For two-dimensional arrays the AMF can either assume row-major order or
column-major order. When we use row-major order we allocate memory row by row
and column-major order uses column-by-column to allocate memory. Assuming
row-major order, the AMF can be expressed as follows.

<strong
    >Addr(A[i, j]) = b + (i - lo <sub>1</sub>)(hi <sub>2</sub> - lo
<sub>2</sub> + 1) _ E.size + (j - lo <sub>2</sub>) _ E.size</strong>

On the contrary, assuming column-major order, the AMF can be expresses as
follows.
