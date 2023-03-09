package com.pkj.wow.dsa.leetcode_blind75.array

/**
 *  input [1, 3, 4, 5, 7, 10, 11]
 *  target 9
 *  output [3, 4]
 *
 */
fun findTwoSum_TC_N(nums: IntArray, target:Int): IntArray{
    var startP = 0
    var endP = nums.size-1

    while (startP < endP){
        var sum = nums[startP] + nums[endP]
        if(sum == target) {
            return intArrayOf(startP+1,endP+1)
        } else if(sum < target) {
            startP++
        } else {
            endP--
        }
    }

    return intArrayOf()
}

fun findTwoSum_TC_N_BestSolution(numbers: IntArray, target: Int): IntArray{
    var left = 0
    var right = numbers.size-1

    while (left < right) {
        val sum = numbers[left] + numbers[right]

        if (sum > target) {
            right--
        } else if (sum < target) {
            left++
        } else {
            return intArrayOf(left+1, right+1)
        }
    }

    return intArrayOf()
}


fun main(){
    println(findTwoSum_TC_N(arrayOf(1, 3, 4, 5, 7, 10, 11).toIntArray(), 9).contentToString())
    println(findTwoSum_TC_N_BestSolution(arrayOf(1, 3, 4, 5, 7, 10, 11).toIntArray(), 9).contentToString())
}