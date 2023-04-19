package com.pkj.wow.dsa.leetcode_blind75

fun isHappy(n: Int): Boolean {

    val set = mutableSetOf<Int>()

    var current = n
    while(!set.contains(current)){
        set.add(current)

        var sum = 0
        var digit = current
        while(digit > 0){
            sum += (digit % 10) * (digit %10)
            digit = digit / 10
            println("$sum , $digit")
        }
        current = sum
        if(current == 1){
            return true
        }
    }

    return false

}


fun main(){
    println("PLOG: <top>->main: 2 is happy Number: ${isHappy(2)} ")
    println("PLOG: <top>->main: 19 is happy Number: ${isHappy(19)} ")
}