package basics

fun main(){
    var x = 3
    //while loop
    while(x > 2){
        println("hello")
        x--
    }
    println("what's up")

    val myArray = arrayOf("hello","world","world")
    val arraylength = myArray.size
    var i = 0
    while(i < arraylength){
        println(myArray[i])
        i++
    }

    //practice
    println("Enter a number")
    var number = readLine()?.toInt()
    println("Lets count from $number down to 0:")
    while(number != null && number >= 0){
        println(number)
        number--
    }
    //practice problem 2 (To find the square of the number)
//    println("Enter number 1:")
//    var a = readLine()?.toInt()
//    println("Enter number 2:")
//    var b = readLine()?.toInt()
//
//    var result = 1
//    var i = 0
//    while(a != null && b != null && i < b){
//        result *= a
//        i++
//    }
//    println("$a to the power of $b is $result")
}