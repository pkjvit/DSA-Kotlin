package com.pkj.wow.dsa.leetcode_blind75.array


fun containsDuplicate(nums: IntArray): Boolean {
    if(nums.size < 2) return false
    val set = mutableSetOf<Int>()

    for(index in 0 until nums.size){
        if(set.contains(nums[index])){
            return true
        }
        set.add(nums[index])
    }
    return false
}

fun containsDuplicate2(nums: IntArray): Boolean {
    val set = mutableSetOf<Int>()
    nums.forEach {
        if(set.contains(it)){
            return true
        }
        set.add(it)
    }
    return false
}

fun main(){
    println(containsDuplicate(intArrayOf(1, 2, 3, 4, 2)))
    println(containsDuplicate2(intArrayOf(1, 2, 3, 4, 2)))
}