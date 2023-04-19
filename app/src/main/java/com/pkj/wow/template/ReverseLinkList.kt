package com.pkj.wow.template

import com.pkj.wow.dsa.leetcode_blind75.linked_list.ListNode

/*
 Reversing a linked list
 */


fun reverseLinkedList(node: ListNode<Int>?) : ListNode<Int>?{
    var previous: ListNode<Int>? = null
    var current = node


    while(current != null){
        var next = current.next
        current.next = previous
        previous = current

        current = next
    }
    return previous
}

fun main(){
    val node = ListNode<Int>(1)
    node.next = ListNode<Int>(2)
    node.next?.next = ListNode<Int>(3)
    println("PLOG: <top>->main: ${reverseLinkedList(node)}")
}