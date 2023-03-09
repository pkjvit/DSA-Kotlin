package com.pkj.wow.dsa.leetcode_blind75.array

/**
 * https://leetcode.com/problems/3sum/
 *
 *  input : [-1,0,1,2,-1,-4]
 *  output: [[-1,-1,2],[-1,0,1]]
 *
 *  sort : [-4, -1, -1, 0, 1, 2]
 *
 *  algo:
 *   1. Sort
 *   2. Three pointer
 *   3. First pointer + for remaining get Two sum with k = 0 - firstPointerValue
 */
fun threeSum(nums: IntArray): List<List<Int>>{
    // Sort the array to remove duplications
    nums.sort()
    val result = mutableListOf<List<Int>>()
    var lastVisited = nums[0]

    for( index in 0 until nums.size-2){
        if(index>0 && lastVisited == nums[index-1]) continue
        val list = twoSum(nums, index, nums[index])
        if(list.isNotEmpty()){
            result.add(list)
        }
        lastVisited = nums[index]
    }
    return result
}

fun twoSum(nums: IntArray, start:Int, a:Int):List<Int>{
    val result = mutableListOf<Int>()
    val target = 0 - a

    var left = start + 1
    var right = nums.size - 1


    while(left < right){
        val sum = nums[left] + nums [right]
        if (sum > target){
            right--
        }else if(sum < target){
            left ++
        }else{
            result.add(a)
            result.add(nums[left])
            result.add(nums[right])
            return result
        }
    }
    return result
}


fun main(){
    println(threeSum(intArrayOf(-1,0,1,2,-1,-4)))
    println(threeSum(intArrayOf(0,0,0,0)))
    println(threeSum(intArrayOf(1,-1,-1,0)))
}