package com.pkj.wow.dsa.algorithms.recursion

/**
 *  0 1 1 2 3 5 8 13 21 ...
 */
class Fibonacci {

    fun findFibonacciRecursive(number: Int):Int{
        return if(number == 0){
            0
        }else if(number == 1 || number == 2){
            1
        }else {
            findFibonacciRecursive(number - 2) + findFibonacciRecursive(number - 1)
        }
    }

    fun findFibonacciIterative(number: Int):Int{
        var result:Int = 0
        return if(number == 0) 0
        else if(number == 1 || number == 2) 1
        else {
            val lastTwoElements = arrayOf(1, 1)
            for (i in 3 .. number) {
                result = lastTwoElements[0] + lastTwoElements[1]
                lastTwoElements[0] = lastTwoElements[1]
                lastTwoElements[1] = result
            }
            result
        }
    }
}



fun main(){
    val fibonacci = Fibonacci()
    println(fibonacci.findFibonacciRecursive(3))
    println(fibonacci.findFibonacciRecursive(4))
    println(fibonacci.findFibonacciRecursive(5))
    println(fibonacci.findFibonacciRecursive(6))
    println(fibonacci.findFibonacciRecursive(7))
    println(fibonacci.findFibonacciIterative(3))
    println(fibonacci.findFibonacciIterative(4))
    println(fibonacci.findFibonacciIterative(5))
    println(fibonacci.findFibonacciIterative(6))
    println(fibonacci.findFibonacciIterative(7))
}