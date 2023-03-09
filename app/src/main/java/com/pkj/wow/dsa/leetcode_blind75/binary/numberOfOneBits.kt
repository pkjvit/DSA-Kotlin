package com.pkj.wow.dsa.leetcode_blind75.binary

/**
 * hammingWeight
 *
 */
fun getNumberOfOneBits(n:Int):Int{
    var result = 0

    var num = n
    while(num != 0){
        if(num.and(1)>0){
            result ++
        }
        num = num.shr(1)
    }

    return result
}

fun main(){
    println(getNumberOfOneBits(5))
    println(getNumberOfOneBits(4))
    println(getNumberOfOneBits(3))
    println(getNumberOfOneBits(2))
}