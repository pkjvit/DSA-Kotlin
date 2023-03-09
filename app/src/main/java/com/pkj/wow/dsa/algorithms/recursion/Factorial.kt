package com.pkj.wow.dsa.algorithms.recursion

/**
 *  !0 = 1
 *  !1 = 1
 *  !2 = 2*1 = 2
 *  !3 = 3*2*1 = 6
 *  !4 = 4*3*2*1 = 24
 *  !5 = 5*4*3*2*1 = 120
 */
class Factorial {

    fun findFactorialRecursive(number: Int): Int{
        if(number == 0 || number == 1){
            return 1
        }
        return number * findFactorialRecursive(number - 1)
    }

    fun findFactorialIterative(number: Int): Int{
        if(number == 0 || number == 1){
            return 1
        }
        var result = 1
        for(i in 2..number){
            result *= i
        }
        return result
    }
}

fun main(){
    val factorial = Factorial()
    println(factorial.findFactorialIterative(5))
    println(factorial.findFactorialRecursive(5))
}