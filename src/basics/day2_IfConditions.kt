package basics

fun main() {
    val x= 10
    val y = 7
    val z= if(x + y == 17) 3 else 2

    if(x < y) {
        println("x is less than y")
    } else if(x > y){
        println("x is greater than y")
    } else{
        println("x is equal to y")
    }
    println(z)

    //practice
    val string = "racecar"
    println("The string is $string")
    if(string == string.reversed()) {
        println("It is palindrome")
    } else{
        println("It is not palindrome")
    }
}