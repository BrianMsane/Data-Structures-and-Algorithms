# Structs or Records

A record is a collection of data values that are not necessarily of the same
type. It is said to be a heterogeneous collection of values.

## Important Concepts

- We use a dot, or membership opeartor to refe to a field on the struct
- Record fields are allocated consecutive memory locations in RAM starting from a base address
- Once defined, you can not add more fields to the struct

## Offset

An offset is the number of types allocated to all the fields before a
specified field in a struct. The use of the sizeof() operator comes handy when
calculating the offset since it gives us the number of bytes needed for each
record.

Let <strong>R[Field <sub>i</sub>, ..., Field<sub>n</sub>]</strong> be a record. The offset of Field<sub>i</sub>, denoted as
<strong>Offset(Field<sub>i</sub>)</strong>, can be expressed as follows <br />
<strong>Offset(Field<sub>i</sub>) = </strong>

## Record Mapping Function

Given the base address, b, and Field<sub>i</sub>, the RMF returns the memory
address used to store the specified filed and it is denoted as
<br /><br />
<strong>Addr(R.Field <sub>i</sub>) = b + Offset(R.Field <sub>i</sub>)</strong>
