package com.pkj.wow.dsa.leetcode_blind75.linked_list

data class ListNode<T>(
    var value: T,
    var next: ListNode<T>? = null
){
    override fun toString(): String {
//        return value.toString() + "->" + next
        return if(next!= null) "$value  -> $next" else "$value"
    }
}