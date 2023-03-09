package com.pkj.wow.dsa.leetcode_blind75.binary

fun getSum(a:Int, b:Int):Int{
    return if(b==0) a else getSum(a.xor(b), a.and(b).shl(1))
}

fun main(){
    println(getSum(2, 3))
}