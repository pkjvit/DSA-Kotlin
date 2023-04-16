package com.pkj.wow.dsa.patterns.two_pointer

import com.pkj.wow.dsa.leetcode_blind75.linked_list.ListNode


fun isLinkedListHasCycle(head: ListNode<Int>?): Boolean {
    var slow = head
    var fast = head

    while (fast != null && fast.next != null ){
        slow = slow?.next
        fast = fast?.next?.next
        if(slow == fast){
            return true
        }
    }
    return false
}

fun cycleLengthInLinkedList(head: ListNode<Int>?): Int {
    var slow = head
    var fast = head

    while (fast != null && fast.next != null ){
        slow = slow?.next
        fast = fast?.next?.next
        if(slow == fast){
            return cycleLength(slow)
        }
    }
    return 0
}

fun cycleLength(node: ListNode<Int>?): Int{
    var current = node?.next
    var counter = 1

    // 1 -> 2 -> 1
    while(current != node){
        current = current?.next
        counter++
    }

    return counter
}

fun startOfCycle(head: ListNode<Int>?, cycleSize: Int): ListNode<Int>?{
    var size = cycleSize
    var slow = head
    var fast = head
    while(size > 0){
        fast = fast?.next
        size--
    }
    while(slow != fast){
        slow = slow?.next
        fast = fast?.next
    }
    return slow
}

// 1 2 3 4 5 6 7 5
fun startOfLinkedListCycle(head: ListNode<Int>?): ListNode<Int>? {
    var slow = head
    var fast = head
    var size = 0
    while (fast != null && fast.next != null ){
        slow = slow?.next
        fast = fast?.next?.next
        if(slow == fast){
            size = cycleLength(slow)
            return startOfCycle(head, size)
        }
    }
    return null
}

fun main(){
    val head  = ListNode(1)
    head.next = ListNode(2)
    head.next!!.next = ListNode(3)
    head.next!!.next!!.next = ListNode(4)
    head.next!!.next!!.next!!.next = ListNode(5)
    head.next!!.next!!.next!!.next!!.next = ListNode(6)

    println("PLOG: <top>->main: ${isLinkedListHasCycle(head)}")
    println("PLOG: <top>->main: ${cycleLengthInLinkedList(head)}")
    println("PLOG: <top>->main: ${startOfLinkedListCycle(head)?.value}")

    head.next!!.next!!.next!!.next!!.next!!.next = head.next!!.next!!.next!!
    println("PLOG: <top>->main: ${isLinkedListHasCycle(head)}")
    println("PLOG: <top>->main: ${cycleLengthInLinkedList(head)}")
    println("PLOG: <top>->main: ${startOfLinkedListCycle(head)?.value}")

    head.next!!.next!!.next!!.next!!.next!!.next = head.next!!.next!!.next!!.next!!
    println("PLOG: <top>->main: ${isLinkedListHasCycle(head)}")
    println("PLOG: <top>->main: ${cycleLengthInLinkedList(head)}")
    println("PLOG: <top>->main: ${startOfLinkedListCycle(head)?.value}")
}

