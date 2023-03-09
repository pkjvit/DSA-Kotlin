package com.pkj.wow.dsa.leetcode_blind75.array

fun twoSum_TC_N(nums: IntArray, target: Int): IntArray{
    val map = mutableMapOf<Int, Int>()
    for(i in 0 until nums.size){
        val diff = target - nums[i]
        if(map.containsKey(diff)){
            val index:Int = map.get(diff)!!
            return intArrayOf(index,i)
        }
        map[nums[i]] = i
    }
    return intArrayOf()
}

fun twoSum_TC_NSquare(nums: IntArray, target: Int): IntArray {
    var first = 0
    var second = 1

    for(i in 0 until nums.size-1){
        first = i
        second = findPosition(nums, i+1, target - nums[first])
        if(second != -1){
            return intArrayOf(first, second)
        }
    }

    return intArrayOf()
}

fun findPosition(nums:IntArray, start:Int, target: Int): Int{
    for (i in start until nums.size){
        if(nums[i] == target){
            return i
        }
    }
    return -1
}

fun main(){
    println(twoSum_TC_NSquare(arrayOf(2, 7, 11, 15).toIntArray(),9).contentToString())
    println(twoSum_TC_NSquare(arrayOf(2, 7, 11, 15).toIntArray(),13).contentToString())
    println(twoSum_TC_NSquare(arrayOf(2, 7, 11, 15).toIntArray(),18).contentToString())
    println(twoSum_TC_NSquare(arrayOf(2, 7, 11, 15).toIntArray(),7).contentToString())

    println(twoSum_TC_N(arrayOf(2, 7, 11, 15).toIntArray(),9).contentToString())
    println(twoSum_TC_N(arrayOf(2, 7, 11, 15).toIntArray(),13).contentToString())
    println(twoSum_TC_N(arrayOf(2, 7, 11, 15).toIntArray(),18).contentToString())
    println(twoSum_TC_N(arrayOf(2, 7, 11, 15).toIntArray(),7).contentToString())
}