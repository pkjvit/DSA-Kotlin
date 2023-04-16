package com.pkj.wow.dsa.patterns.sliding_window

fun findMaxSumSubArray(k:Int, arr:IntArray):Int{
    var max = Int.MIN_VALUE
    var windowSum = 0
    var windowStart = 0
    for(windowEnd in 0 until arr.size){
        windowSum += arr[windowEnd]

        if(windowEnd >= k-1){
            max = maxOf(windowSum, max)
            windowSum -= arr[windowStart]
            windowStart++
        }
    }
    return max
}


fun main(){
    println("PLOG: <top>->main: ${findMaxSumSubArray(3, intArrayOf(2, 1, 5, 1, 3, 2))}")
    println("PLOG: <top>->main: ${findMaxSumSubArray(2, intArrayOf(2, 3, 4, 1, 5))}")
}