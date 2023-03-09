package com.pkj.wow.dsa.leetcode_blind75.array

/**
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 *
 *  prefix product = 1 1 2 6
 *  postfix product= 24 12 4 1
 *
 */

fun productExceptSelf(nums: IntArray): IntArray{
    val result = IntArray(nums.size)

    var prefix = 1
    result[0] = 1

    for( i in 1 until nums.size){
        prefix *= nums[i-1]
        result[i] = prefix
    }
//    println(result.contentToString())
    var postfix = 1
    for( i in nums.size-1 downTo  0){
        result[i] = result[i] * postfix
        postfix *= nums[i]
    }
//    println(result.contentToString())

    return result

}

fun main(){
    println(productExceptSelf(intArrayOf(1,2,3,4)).contentToString())
    println(productExceptSelf(intArrayOf(-1,1,0,-3,3)).contentToString())
}