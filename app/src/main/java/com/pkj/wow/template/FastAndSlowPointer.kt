package com.pkj.wow.template

import com.pkj.wow.CONDITION
import com.pkj.wow.DO_LOGIC
import com.pkj.wow.dsa.leetcode_blind75.linked_list.ListNode

fun fastAndSlowPointer(listNode: ListNode<Int>?) : Boolean{
    var slow = listNode
    var fast = listNode

    while( fast != null && fast.next != null){

        DO_LOGIC()
        if(CONDITION()){
            return true
        }

        slow = slow?.next
        fast = fast.next?.next
    }

    return false
}