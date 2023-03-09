package com.pkj.wow.dsa.leetcode_blind75.array

/**
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
 * In this case, the max area of water (blue section) the container can contain is 49.
 */
fun maxArea_BestSoultion(heights: IntArray): Int{
    var result = 0
    var left = 0
    var right = heights.size-1

    while(left <= right){
        val area = (right-left) * minOf(heights[left], heights[right])
        result = maxOf(result, area)

        if(heights[left] < heights[right]){
            left ++
        }else{
            right --
        }
    }
    return result
}

fun maxArea(heights: IntArray): Int{
    var result = 0

    for(left in 0 until heights.size){
        for(right in left+1 until heights.size){
            val area = (right - left) * minOf(heights[left], heights[right])
            result = maxOf(area, result)
        }
    }


    return result
}


fun main(){
    println(maxArea(intArrayOf(1,8,6,2,5,4,8,3,7)))
    println(maxArea_BestSoultion(intArrayOf(1,8,6,2,5,4,8,3,7)))
}

