package com.pkj.wow.template

import java.util.*

fun monotonicIncreasingStack(array: IntArray): IntArray{
    val result = mutableListOf<Int>()
    val stack = Stack<Int>()

    for(number in array){
        while(stack.isNotEmpty() && stack.peek() > number){
            stack.pop()
        }
        stack.push(number)
    }

    for(number in stack){
        result.add(number)
    }
    return result.toIntArray()
}

fun monotonicDecreasingStack(array: IntArray): IntArray{
    val result = mutableListOf<Int>()
    val stack = Stack<Int>()

    for(number in array){
        while(stack.isNotEmpty() && stack.peek() < number){
            stack.pop()
        }
        stack.push(number)
    }

    for(number in stack){
        result.add(number)
    }
    return result.toIntArray()
}


fun main(){
    println("PLOG: <top>->main: ${monotonicIncreasingStack(intArrayOf(1, 4, 5, 3, 12, 10)).contentToString()}")
    println("PLOG: <top>->main: ${monotonicDecreasingStack(intArrayOf(1, 4, 5, 3, 12, 10)).contentToString()}")
}