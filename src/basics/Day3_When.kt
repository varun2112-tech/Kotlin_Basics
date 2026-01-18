package basics

fun main(){
    val age = readln().toInt()

    when(age){ //it is only dependent on single variable
        in 0..5 -> println("You are a young kid")
        in 6..17 -> println("You are a teenager")
        18 -> println("Finally you are 18")
        19,20 -> println("You are a young adult")
        in 21..65 -> println("You are an adult")
        else -> println("You are really old")
    }
}