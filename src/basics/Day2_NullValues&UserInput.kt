package basics

fun main() {
//    val userInput = readLine()
//    println("You entered $userInput")
//    println(userInput?.uppercase())
//    if(userInput != null)
//        println(userInput.toInt() - 5)

    //practice
    println("Please enter your age")
    val age = readLine()?.toInt()
    if (age != null) {
        if (age >= 0 && age < 18)
            println("You are not an adult")
    else if (age >= 18 && age <= 65) {
        println("You are  an adult")
    } else {
        println("You are really old")
    }
    }

}