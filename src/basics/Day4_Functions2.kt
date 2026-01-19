package basics

// Functions with return values

fun main(){
    val pow = Pow(3,5)
    println("3 to the power 5 is $pow")
    println(multiply(3,5))
    val list = listOf(3,2,4,1,5,6,7)
    println("Tbe list is looking like these $list")
    print("Search for this number:")
    val input = readln()?.toInt()
    if(input != null){
        println("The indes of $input is ${FindIndex(list,input)}")
    }
}

fun Pow(base:Int, exponent: Int): Int {
    var result = 1
    for (i in 1..exponent){
        result *= base
    }
    return result
}

//One line function
fun multiply(a: Int, b: Int) = a * b

//Practice problem

fun FindIndex(list: List<Int>, value: Int): Int {
   for(i in 0 until list.size-1){
       if(list[i] == value) {
            return i
       }
   }
    return -1
}