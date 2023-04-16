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


/*fun threeSum(numbers: IntArray):List<List<Int>>{

    val result = mutableListOf<List<Int>>()
    if(numbers.isEmpty()){
        return result
    }
    numbers.sort()
    var lastVisit = numbers[0]

    for(index in 0 until numbers.size-2){

        if(index > 0 && lastVisit == numbers[index]) continue
        // two sum
        val k = 0 - numbers[index]
        var left = index + 1
        var right = numbers.size-1

        while(left < right){
            val sum = numbers[left] + numbers[right]
            if(sum == k){
                val subResult = listOf(numbers[left], numbers[right], numbers[index])
                result.add(subResult)
                left++
            } else if(sum < k){
                    left++

            }else{
                right --
            }
        }
        lastVisit = numbers[index]



        *//*var map = mutableMapOf<Int, Int>()

        for(j in index+1 until numbers.size){

            if(map.containsKey(k - numbers[j])){
                val subResult = mutableListOf<Int>()
                subResult.add(numbers[j])
                subResult.add(map.getOrDefault(k-numbers[j],0))
                subResult.add(numbers[index])
                result.add(subResult)
            }
            map.put(numbers[j], j)
        }*//*


    }
    return result
}*/


fun threeSum(intArray: IntArray):List<IntArray>{
    val result = mutableListOf<IntArray>()



    return result
}


fun main(){
    println(threeSum(intArrayOf(-1,0,1,2,-1,-4)))
    println(threeSum(intArrayOf(0,0,0,0)))
    println(threeSum(intArrayOf(1,-1,-1,0)))
}






/*fun threeSum(nums: IntArray): List<List<Int>>{
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
}*/