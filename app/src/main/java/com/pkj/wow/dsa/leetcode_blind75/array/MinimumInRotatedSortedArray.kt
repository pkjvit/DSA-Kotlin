package com.pkj.wow.dsa.leetcode_blind75.array

/**
 * Input: nums = [4,5,6,7,0,1,2]
 * Output: 0
 * Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
 */
fun findMinimum(nums: IntArray): Int{
    var min = nums[0]
    var left = 0
    var right = nums.size-1

    while (left <= right){
        if(nums[left] < nums[right]){
            min = minOf(min, nums[left])
            break
        }
        var mid = (left + right)/2
        min = minOf(min, nums[mid])

        // left sorted portion
        if(nums[left] <= nums[mid]){
            left = mid + 1
        }

        // right sorted portion
        else{
            right = mid - 1
        }
    }
    return min
}


fun main(){
    println(findMinimum(intArrayOf(4,5,6,7,0,1,2)))
    println(findMinimum(intArrayOf(4,5,6,0,1,2,3)))
    println(findMinimum(intArrayOf(4,5,6,7,0,1)))
    println(findMinimum(intArrayOf(4,5,6,7,8,0)))
    println(findMinimum(intArrayOf(7,0,1,2,4)))
    println(findMinimum(intArrayOf(0,1,2,4)))
}