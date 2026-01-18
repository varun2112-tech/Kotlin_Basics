package basics

fun main(){
//    val myArray = arrayOf(1,2,3,4,5)
//    for(i in myArray){
//        println(i)
//    }
//    for ( i in 1..7){
//        println(i)
//    }
//    for ( i in 10 downTo 5){
//        println(i)
//    }
//    for (i in 10 downTo 5 step 2 ){
//        println(i)
//    }
//    for (i in 'a'..'z') {
//        println(i)
//    }
//    val myArray2 = arrayOf(4,5,8,9,10,2,3)
//    var max = myArray2[0]
//    for(item in myArray2){
//        if(item > max){
//            max = item
//        }
//    }
//    println(max)


    //Practice Problem1 (To find the sum of the array)
    val myArray = arrayOf(1,2,3,4,5)
    var sum = 0
    for(items in myArray){
        sum += items
    }
    println(sum)

    //Practice Problem 2 ( To find the average of the array by user-input)

    println("Enter 5 number :")
    var avg = 0.0
    for (i in 1..5){
        var input = readLine()?.toInt()
        if(input !=null){
            avg += input / 5.0
        }
    }

    println(avg)
}