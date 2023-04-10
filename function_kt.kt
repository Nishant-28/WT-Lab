// fun f1(){
//     val a = "Text 1"
//     println(a)
// }

// fun f2(){
//     val b = "Text 2"
//     println(b)
// }

// var name = ""

// fun setName(){
//     name = "Mike"
// }

// fun printName(){
//     println(name)
// }

// fun printStars(num: Int) {
//     for(j in 1..num){
//         print("* ")
//     }
//     println()
// }

// fun ascendingTriangle(height: Int) {
//     for(k in 1..height){
//         printStars(k)
//     }
// }

// fun biggerOf(a: Int,b: Int): Int {
//     if(a > b){
//         return a
//     }
//         return b   
// }

fun biggerOf(a: Int, b: Int): Int = if (a>b) a else b

// fun triangleArea(base: Double, height: Double): Double {
//     return base * height / 2
// }

fun triangleArea(base: Double, height: Double): Double = base * height / 2

fun main(){
    // setName()
    // printName()

    // val height = 5
    // ascendingTriangle(height)
    println(biggerOf(-3, 1));
    println(biggerOf(10, 20));

    println(triangleArea(10.0, 20.0))
}