package basics

fun main(){
    val array = intArrayOf(10,20,30)
    val max = getMax(1,2,3,*array,6,7,2,3,10)
    println(max)
    searchFor("How to become a good programmer")
    searchFor("How to become a good kotlin programmer","Bing")
    val sum = alternatingSum(3,4,5,2,1,2,3)
    println("The alternating sum is $sum")
}

//vararg keyword

fun getMax(vararg numbers: Int): Int{
    var max = numbers[0]
    for(number in numbers){
        if(number > max){
            max = number
        }
    }
    return max
}

//Default

fun searchFor(search: String, searchEngine: String = "Google"){
    println("Searching for $search on $searchEngine")
}

fun alternatingSum(vararg num:Int): Int{
    var add = 0
    for(i in num.indices){
        if(i%2 == 0){
            add += num[i]
        } else{
            add -= num[i]
        }
    }
    return add
}

