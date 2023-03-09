package com.pkj.wow.dsa.leetcode_blind75.array

/**
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 */

fun maxSubArray(nums: IntArray): Int{
    var max = 0
    var windowSum = 0

    for(i in nums.indices){
        windowSum = Math.max(windowSum + nums[i], nums[i])
        max = Math.max(max, windowSum)

    }
    return max
}

fun main(){
    println(maxSubArray(intArrayOf(-2,1,-3,4,-1,2,1,-5,4)))
}