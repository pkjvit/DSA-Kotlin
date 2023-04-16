package com.pkj.wow.dsa.patterns.sliding_window

fun findMinSubArray(s:Int, arr: IntArray):Int{
    var min = Int.MAX_VALUE
    var windowSum = 0
    var windowStart = 0

    for(windowEnd in arr.indices){
        windowSum += arr[windowEnd]
        while(windowSum >= s) {
            min = minOf(min, (windowEnd - windowStart + 1))
            windowSum -= arr[windowStart]
            windowStart++
        }
    }
    
    return min
}


fun main(){
    println("PLOG: <top>->main: ${findMinSubArray(7, intArrayOf(2, 1, 5, 2, 3, 2))}")
}