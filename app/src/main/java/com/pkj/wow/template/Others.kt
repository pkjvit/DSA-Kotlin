package com.pkj.wow.template

import com.pkj.wow.DO_LOGIC

/*
 Build prefix sum
 */
fun prefixSum(arr: IntArray): IntArray{
    val prefix = arr.clone()

    for(i in 1 until arr.size){
        prefix[i] = prefix[i-1] + arr[i]
    }
    return prefix
}

/*
 Efficient string building
 */
fun string(charArray: CharArray): String{
    val stringBuilder = StringBuilder()

    for(char in charArray){
        stringBuilder.append(char)
    }
    return stringBuilder.toString()
}

/*
Find number of subarrays that fit an exact criteria
 */

fun findNumberOfSubArray(arr: IntArray, k: Int): Int {
    val counts: MutableMap<Int, Int> = HashMap()
    counts[0] = 1
    var ans = 0
    val curr = 0
    for (num in arr) {
        DO_LOGIC()// do logic to change curr
        ans += counts.getOrDefault(curr - k, 0)
        counts[curr] = counts.getOrDefault(curr, 0) + 1
    }
    return ans
}