--  Write a Shell Script to input 2 number, and perform all the arithmetic calculations like +,-,*,/ and %, and display the result with a proper message.

#!/bin/bash
 
a=10
b=20
 
sum=$(( $a + $b ))
 
echo "Sum is: $sum"



#!/bin/bash
echo "Enter two numbers"
read a
read b
echo "Sum of two numbers is : `expr $a + $b`"
echo "Difference of two numbers is : `expr $a - $b`"
echo "Product of two numbers is : `expr $a \* $b`"
echo "Division of two numbers is : `expr $a / $b`"
echo "Modulus of two numbers is : `expr $a % $b`"