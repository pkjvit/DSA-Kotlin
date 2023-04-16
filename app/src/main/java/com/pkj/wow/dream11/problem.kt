package com.pkj.wow.dream11


/*
Input : arr[] = {0, -1, 2, -3, 1}

Output : (0 -1 1) or (2 -3 1)
 */

fun findThreeSum(intArray: IntArray): List<IntArray>{
    val result = mutableListOf<IntArray>()
    if(intArray.size < 3){
        return result
    }

    intArray.sort()

    for(i in 0 until intArray.size-2){

        // two sum
        var left = i+1
        var right = intArray.size-1

        while (left < right){
            val sum = intArray[i] + intArray[left] + intArray[right]

            if(sum == 0){
                result.add(intArrayOf(intArray[i], intArray[left], intArray[right]))
                left++
                right--
            }else if( sum < 0){
                left ++
            }else{
                right --
            }
        }

    }


    return result
}


/*
Given an array of n positive integers and a number k.
Find the minimum number of swaps required to bring all the numbers less than or equal to k together.

For example:

Input: [2, 1, 5, 6, 3], k = 3
2,1,3,5,6
1,2,3,6,5
3,2,1,
3,1,2,

2,1,3,5,6
5,2,1,3,6
5,6,2,1,3




for(i in arr.indices){
    if(arr[i] > k){
        swap(arr[i],
    }
}





Output: 1
Explanation: If we swap 5 (index 2) with 3 (index 4) we have [2, 1, 3, 6, 5]

Input: [2, 7, 9, 5, 8, 6, 7, 4], k = 6
Output: 2
Explanation: If we swap 2(index 0) with 8(index 4) and 7(index 6) with 4(index 7) we have [8, 7, 9, 5, 2, 6, 4, 7]
 */

fun main(){
    println("hello world")
}