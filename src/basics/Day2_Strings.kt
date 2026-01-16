package basics

import java.util.Locale
import java.util.Locale.getDefault

fun main(){
    val string = "this is an example text"
    println(string)
    println("Our string is : ${string}")

    //Methods os strings
    println(string.uppercase(getDefault()))

    //Example
    val name = "Varun"
    println(name.uppercase())
    println(name.reversed())
}