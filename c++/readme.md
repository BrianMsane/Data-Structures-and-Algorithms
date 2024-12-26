<h1>Structs or Records</h1>
<p>
  A record is a collection of data values that are not necessarily of the same
  type. It is said to be a heterogeneous collection of values.
</p>

<h2>Important Concepts</h2>
<ul>
  <li>
    We use the dot, or membership operator to refer to a field on the struct
  </li>
  <li>
    Record fields are allocated consecutive memory locations in RAM starting
    from a base address
  </li>
  <li>Once defined, you can not add more values to a struct</li>
</ul>

<h2>Offset</h2>
<p>
  An offset is the number of types allocated to all the fields before a
  specified field in a struct. The use of the sizeof() operator comes handy when
  calculating the offset since it gives us the number of bytes needed for each
  record. <br />

Let <strong>R[Field <sub>i</sub>, ..., Field<sub>n</sub>]</strong> be a
record. The offset of Field<sub>i</sub>, denoted as
<strong>Offset(Field<sub>i</sub>)</strong>, can be expressed as follows <br />
<strong>Offset(Field<sub>i</sub>) = </strong>
</p>

<h2>Record Mapping Function</h2>
<p>
  Given the base address, b, and Field<sub>i</sub>, the RMF returns the memory
  address used to store the specified filed and it is denoted as
  <br /><br />
  <strong>Addr(R.Field <sub>i</sub>) = b + Offset(R.Field <sub>i</sub>)</strong>
</p>
