package basics

fun main(){
    val array = arrayOf(1,2,3)//can be changed during runtime
    val list = listOf(1,2,3)// cannot be changed during run time

    array[0] = 3
    //list[0] = 5 //immutable
     val list2 = mutableListOf(1,2,3)//this is a mutable list
    list2.add(4)
    list2.removeAt(1)
    println(list2)

    val list3 = mutableListOf<Int>()
    for(i in 1..10){
        val x = readLine()?.toInt()
        if(x != null) {
            list3.add(x)
        }
    }
    println(list3)


    //Practice problem 1
    println("Enter 5 numbers")
    val list4 = mutableListOf<Int>()
    for (i in 1..5){
        val a=readln()?.toInt()
        if(a != null){
            list4.add(a)
        }
    }
    list4.reverse() //for(i in list4.size - 1 downTo 0){println(list4[i])
    println(list4)

    //practice problem 2
//    val list = mutableListOf(0,1)
//    println("Enter a number n > 1:")
//    val x = readln()?.toInt()
//    if(x != null){
//        for (i in 2..x-1){
//            list.add(list[i-2] +list[i-1])
//        }
//    }
//    println(list)
}


