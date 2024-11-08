# Trailer-Loading-Coding
A coding assignment to develop a program to load a semi-trailer with cargo. 

# Prompt
A 53 foot dry van is the most common trailer that is atached to a tractor for truck cargo in North
America. If you open the doors, remove the roof, and look at it from above it forms a U-shape with the
open doors at the top and the closed end that ataches to the tractor at the bottom.
Our dry van is 10 feet wide by 53 feet deep and represented by a two-dimensional grid. The width is
along the x-axis, with the left wall at the left of coordinate 0 and right wall to the right of coordinate 9.

The depth of the trailer is along the y-axis, with the closed end of the trailer at the bottom of the y-
coordinate 0 and the open end at 52.

Write a program that loads cargo into the trailer. The cargo shapes and names are given below. Your
program will accept a cargo shape and x-axis locaƟon in a series of records in the form: “3O,9I,0J”.
Cargo is loaded straight in from the open end (top) to the empty end (bottom). The cargo cannot be
rotated, and it does not move on the x-axis.
Your program should accept the records via standard input then output the highest 0-indexed y-axis that
has an occupied square to standard output.
Use any general-purpose programming language; you may not use libraries outside of the core language.



# Constraints:
* x-axis is a 1-character string corresponding to an integer >= 0 and <= 9. The x-axis is the leftmost
part of the piece
* shape is one upper case character in the set below
* entries are two characters delimited by a comma
* input length is 1 to 500 entries long
* the cargo will not overfill the trailer
* the input is always well formated
* the x-axis porton of the pieces always fit into the width of the trailer
  

![Cargo-Shapes](https://github.com/user-attachments/assets/fd81f472-4fbc-46fe-b1c6-a2842283c062)

# Test Case

  ![Cargo-Example-2](https://github.com/user-attachments/assets/66ce1411-00c7-4e53-b81c-2c6d8d93a212)
  ![Cargo-Example-1](https://github.com/user-attachments/assets/bb9859d4-0fbd-4cf2-b9c7-ee6d6368536c)

