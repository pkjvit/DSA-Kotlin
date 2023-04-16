package com.pkj.wow.dsa.algorithms.recursion


fun factorial(value: Int): Int{
    if(value == 0 || value == 1){
        return 1
    }
    
    return value * factorial(value-1)
}
// 0 1 1 2 3 5
fun fibonacci(value : Int): Int{
    if(value == 0){
        return 0
    }
    if(value == 1){
        return 1
    }
    return fibonacci(value-1) + fibonacci(value-2)
}
/*
f(5)
f(4)         +      f(3)
f(3) + f(2)        f(2) + f(1)
*/
fun main(){
    println("PLOG: <top>->main: ${factorial(5)}")
    println("PLOG: <top>->main: ${fibonacci(5)}")
}