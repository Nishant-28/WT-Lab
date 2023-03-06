pi=3.14

echo "Enter the radius of the circle: "
read r


area=$(echo "$pi * $r * $r" | bc)

perimeter=$(echo "2 * $pi * $r" | bc)


echo "The area of the circle is $area"
echo "The perimeter of the circle is $perimeter"