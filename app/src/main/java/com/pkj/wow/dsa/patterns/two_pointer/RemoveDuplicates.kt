package com.pkj.wow.dsa.patterns.two_pointer

/*
Input: [2, 3, 3, 3, 6, 9, 9]
Output: 4
Explanation: The first four elements after removing the duplicates will be [2, 3, 6, 9].
 */
fun removeDuplicates(arr: IntArray): Int{
    var nextNonDuplicate = 1

    for(i in arr.indices){
        if(arr[nextNonDuplicate-1] != arr[i]){
            arr[nextNonDuplicate] = arr[i]
            nextNonDuplicate++
        }
    }

    return nextNonDuplicate
}

fun main(){
    println("PLOG: <top>->main: ${removeDuplicates(intArrayOf(2, 3, 3, 3, 6, 9, 9))}")
    println("PLOG: <top>->main: ${removeDuplicates(intArrayOf(2, 2, 2, 11))}")
}