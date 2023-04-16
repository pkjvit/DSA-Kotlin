package com.pkj.wow.dsa.patterns.two_pointer



/*
Input: [1, 2, 3, 4, 6], target=6
Output: [1, 3]
Explanation: The numbers at index 1 and 3 add up to 6: 2+4=6

same as two sum problem
 */

fun search(target: Int, arr: IntArray): IntArray{

    var start = 0
    var end = arr.size-1

    while(start<end){
        val twoSum = arr[start] + arr[end]
        if(twoSum == target){
            return intArrayOf(start, end)
        }else if(twoSum > target){
            end --
        }else{
            start ++
        }
    }
    return intArrayOf()
}



fun main(){
    println("PLOG: <top>->main: ${search(6, intArrayOf(1, 2, 3, 4, 6)).contentToString()}")
    println("PLOG: <top>->main: ${search(11, intArrayOf(2, 5, 9, 11)).contentToString()}")
}