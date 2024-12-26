<h1>Stack Data Structure</h1>
<p>
  A stack is a list of homogenous, of the same type, elements in which the
  addition and deletion of elements only occurs at one end called the top of the
  stack. To drive this near home, we can make an example of a stack of books. In
  a stack of books you only have access to the top; that means if you want to
  take a book you remove the one at the top until you get to the desired one.
  Also, you only add by putting the book at the top of the stack.
</p>

<p>
  One important thing about stacks is that the elements are stored and retrieved
  using the last-in-first-out fashion which basically means that the last
  element to be added to the stack is the first one to be retrieved from the
  stack. Adding elements to a stack is an operation called
  <strong>push</strong>, and removing elements from a stack is one operation
  called <strong>pop</strong>. So to retrieve, but not delete, the element on
  the top of hte stack is an operation called <strong>top</strong>. So the basic
  operations that can be performed on the stack are as follows, not only these
  but the application scenario may define more:
</p>

<ul>
  <li>Stack() - constructor which creates and empty stack</li>
  <li>S.Push(T e) - adds data element onto stack S</li>
  <li>S.Pop() - deletes the data element at the top of the stack</li>
  <li>S.Top() - gets, but not delete, the element at the top</li>
  <li>S.isEmpty() - checks to see if a stack is empty</li>
  <li>S.isFull() - checks if a stack if full.</li>
</ul>

<p>
  There are two main approaches that can be used to implement a stack and these
  are:
  <li>Array-based Implementation</li>
  <li>Linked- or pointer-based Implementation</li>
</p>
