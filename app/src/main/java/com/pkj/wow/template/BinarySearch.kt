package com.pkj.wow.template

fun binarySearch(arr: IntArray, element: Int): Int{

    var left = 0
    var right = arr.size-1

    while(left <= right){
        val mid = (left + right)/2

        if(arr[mid] == element){
            return mid
        }else if(arr[mid] > element){
            right = mid - 1
        }else{
            left = mid + 1
        }
    }

    return -1
}


fun main(){
    println("PLOG: <binary search>->main: ${binarySearch(intArrayOf(1, 2, 3, 4, 6, 8), 6)}")
    println("PLOG: <binary search>->main: ${binarySearch(intArrayOf(1, 2, 3, 4, 6, 8), 1)}")
    println("PLOG: <binary search>->main: ${binarySearch(intArrayOf(1, 2, 3, 4, 6, 8), 8)}")
    println("PLOG: <binary search>->main: ${binarySearch(intArrayOf(1, 2, 3, 4, 6, 8), 3)}")
    println("PLOG: <binary search>->main: ${binarySearch(intArrayOf(1, 2, 3, 4, 5, 6, 8), 4)}")
}