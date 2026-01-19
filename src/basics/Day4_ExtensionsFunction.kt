package basics

fun main(){
    println("Please enter a number")
    val input = readln()?.toInt()
    if(input != null) {
        if(input.isPrime()){
            println("$input is prime")
        } else{
            println("$input is not prime")
        }
    }

    //problem

    var list = listOf<Int>(1, 2, 3, 4, 5, 6)
    var result = list.product()
    println("The product of [1,2,3,4,5,6] is $result")
}

fun Int.isPrime():Boolean{
    for (i in 2 until this - 1){
        if(this % i == 0){
            return false
        }
    }
    return true
}

//problem

fun List<Int>.product(): Int{
    var product = 1
    for (i in this){
        product *= i
    }
    return product
}