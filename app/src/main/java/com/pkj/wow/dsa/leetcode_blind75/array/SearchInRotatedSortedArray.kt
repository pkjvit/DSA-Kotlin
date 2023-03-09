package com.pkj.wow.dsa.leetcode_blind75.array

/**
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * while (l <= r)
 * //left sorted portion
 * if( leftV <= midV)
 *   if(target < leftV)
 *    l = mid + 1
 *   else
 *    r = mid - 1
 * //right sorted portion
 * else
 *   if(target < rightV)
 *    l = mid + 1
 *   else
 *    r = mid - 1
 *
 *
 */
fun search(nums: IntArray, target: Int):Int{
    var result = -1
    var left = 0
    var right = nums.size - 1

    while (left <= right){
        var mid = (left + right) / 2
        if(nums[mid] == target){
            result = mid
        }

        // left sorted portion
        if(nums[left] <= nums[mid]){
            if(target > nums[mid] || target < nums[left]){
                left = mid + 1
            }else{
                right = mid - 1
            }
        }
        // right sorted portion
        else{
            if(target < mid || target > nums[right]){
                right = mid - 1
            }else{
                left = mid + 1
            }

        }
    }

    return result
}


fun main(){
    println(search(intArrayOf(4,5,6,7,0,1,2), 0))
    println(search(intArrayOf(4,5,6,7,0,1), 7))
    println(search(intArrayOf(6,7,0,1,2), 7))
}