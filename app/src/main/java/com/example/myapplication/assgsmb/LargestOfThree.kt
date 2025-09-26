package com.example.myapplication.assgsmb

fun main(){
   // largestAmoungThree()

//   val F= factorial(5)
//    println(F)
    nullCheck("KushagrA")
    nullCheck("")
    checkEven()
}

fun largestAmoungThree(){
    println("Enter the First Number")
    var a:Int= readLine()!!.toInt()
    println("Enter the Second Number")
    var b:Int= readLine()!!.toInt()
    println("Enter the Third Number")
    var c:Int= readLine()!!.toInt()
    val max :Int
    if(a>=b&&a>=c) max=a
    else if(b>=a&&b>=c) max=b
    else max=c
    println("The maximum value is $max")
}

fun factorial(N:Int): Int {
    var fact: Int=1
    if (N < 0) {
        println("Factorail Undefined")
        return -1
    } else if (N == 0) {
        println("Factorial is 1")
        return 1
    } else {

        for (i in N downTo 1 ){
            fact *= i
        }

        return fact
    }
}

//fun factRec(N:Int):Int{
//    if(N==0){
//        return 1
//    }
//    else if (N>=1) factRec(N-1)
//
//
//
//}
fun checkEven(){
    var n=8
    val num: MutableList<Int> = mutableListOf<Int>()
    for(i in 1.. n ){
        println("Enter The value $i:")
        var Num:Int = readLine()!!.toInt()
        num.add(Num)
    }
    println("Even Numbers Are:")
    for (m in num){
        if(m%2==0){
            print(" $m")
        }
    }
}

fun nullCheck(test:String?):Unit{
    if(test != null && test.length >0){
        println("The length ${test.length}")
    }
    else{println("No name")}

}



