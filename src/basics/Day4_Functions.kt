package basics

//Day 4 - Funtions and Parameters

fun main(){
    val x = 3
    printThreeLines() //Function called
    printPow(3,5)
    printPow(2,10)
    addNumbers()
}

fun printPow(base: Int, exponent: Int){
    var result = 1
    for(i in 1..exponent){
        result *= base
    }
    println("$base to the power of $exponent is $result")
}
//Function intialized
fun printThreeLines(){
    println("First line")
    println("Second line")
    println("Third line")
}


//Practice problem

fun addNumbers(){
    var result = 0
    for (i in 1..5){
        result += i
    }
    println("The sum is $result")
}
