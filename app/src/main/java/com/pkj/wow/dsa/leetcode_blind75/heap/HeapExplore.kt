package com.pkj.wow.dsa.leetcode_blind75.heap

import java.util.*


fun main(){
    val priorityQueue = PriorityQueue<Int>() // minHeap default // maxHeap - (Collections.reverseOrder())
    priorityQueue.add(2)
    priorityQueue.add(5)
    priorityQueue.add(4)
    priorityQueue.add(1)

    println(priorityQueue.toString())

    println(priorityQueue.peek())

    priorityQueue.poll()
    println(priorityQueue.toString())

    priorityQueue.add(3)
    println(priorityQueue.toString())

    priorityQueue.poll()
    println(priorityQueue.toString())

    priorityQueue.poll()
    println(priorityQueue.toString())

    priorityQueue.poll()
    println(priorityQueue.toString())

    println("==== Stack ====")
    val stack = Stack<Int>()

    stack.push(1)
    stack.push(2)
    stack.add(4)
    stack.add(3)

    println(stack.toString())

    println(stack.peek())

    stack.pop()

    println(stack)

    println("==== Queue ====")

    val queue = kotlin.collections.ArrayDeque<Int>()

    queue.add(1)
    queue.add(2)
    queue.add(4)
    queue.add(3)

    println(queue.toString())

    println(queue.first())
    println(queue.last())

    queue.removeFirst()
    println(queue.toString())

    println("=== LinkedList ====")
    val linkedList = LinkedList<Int>()
    linkedList.add(1)
    linkedList.add(2)
    linkedList.add(4)
    linkedList.add(3)

    println(linkedList.toString())
    linkedList.remove()
    println(linkedList.toString())

    println("=== Array Intervals ===")
    val intervals:Array<Array<Int>> = arrayOf(
        arrayOf(1,3),
        arrayOf(8,10),
        arrayOf(2,6)
    )
    intervals.sortBy { it[0] }

    println(intervals.contentDeepToString() )

    println("Max ${Int.MAX_VALUE}")
    println("Min ${Int.MIN_VALUE}")

    val arrayWithDefaultValue = IntArray(10){ 20*(it+1) }
    println("arrayWithDefaultValue : ${arrayWithDefaultValue.contentToString()}")

    val string = "helloworld"
    val index = string[0] - 'a'
    println("charIndex : ${string[0].code} $index")
    println("charIndex : a-${'a'.code} A-${'A'.code}")
}
