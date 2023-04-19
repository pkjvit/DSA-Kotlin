package com.pkj.wow.template

import java.util.Collections
import java.util.PriorityQueue


fun findTopKElement(arr: IntArray, k: Int): IntArray{

    val heap = PriorityQueue<Int>()

    for(i in 0 until k){
        heap.add(arr[i])
    }

    for(i in k until arr.size){
        if(heap.peek() < arr[i]){
            heap.poll()
            heap.add(arr[i])
        }
    }

    return heap.toIntArray()
}


fun main(){
    val comparator = Comparator<Int> { o1, o2 -> o1 - o2 }
    val comparatorRev = Comparator<Int> { o1, o2 -> o2 - o1 }
    val list = intArrayOf(2,3,6,4,8,1)

    println("PLOG: <input>->main: ${list.contentToString()}")
    println("PLOG: <sorted ascending>->main: ${list.sortedWith(comparator)}")
    println("PLOG: <sorted descending>->main: ${list.sortedWith(comparatorRev)}")

    println("PLOG: <top 3>->main: ${findTopKElement(list, 3).contentToString()}")
}