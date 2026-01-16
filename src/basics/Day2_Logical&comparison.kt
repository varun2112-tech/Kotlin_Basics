package basics

fun main(){
//    val x= 5
//    val y = 5
//    //comparison operators
//    println(x == y)
//    println(x > y)
//    println(x <=y)
//    println( x !=y)
//
//    val a = 6
//    val b = 10
//    //Logical operators
//    println( x==y && a==b)
//    println(x == y || a == b)
//    println(!(x == y) || a == b)

    //pracitce
    val simpleExpression = 3 > 4 || 4 > 3 && 4 <= 4
    println(simpleExpression)

    val bool = true
    val x = 9
    val y = 3
    val z = 9
    val hardExpression = !(x != z) && bool || z > (x+y) && (!bool || y < z)
    println(hardExpression)
}