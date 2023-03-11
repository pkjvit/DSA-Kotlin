package com.pkj.wow.dsa.leetcode_blind75.linked_list

/*
https://leetcode.com/problems/reverse-linked-list/
https://www.youtube.com/watch?v=G0_I-ZF0S38

input:  1->2->3->4->null
output: 4->3->2->1->null


 */
fun reverseListIterative(root: ListNode<Int>?): ListNode<Int>?{
    var head = root
    var revHead:ListNode<Int>? = null
    var headNext:ListNode<Int>? = null

    while(head != null){
        headNext = head.next
        head.next = revHead
        revHead = head
        head = headNext
    }

    return revHead
}

fun reverseList(head: ListNode<Int>?): ListNode<Int>? {

    if(head == null || head.next == null){
        return head
    }

    var newHead = reverseList(head.next)

    // head -> 3, newHead(head.next) -> 4, head.next.next = null
    head.next?.next = head // 4 -> 3
    head.next = null // 3 -> null
    // 4 -> 3 -> null
    return newHead
}

fun main(){
    var head = ListNode(
                value = 1,
                next = ListNode(
                        value = 2,
                        next = ListNode(
                                value = 3,
                                next = ListNode(4)
                        )
                )
    )
    var head2 = ListNode(
        value = 1,
        next = ListNode(
            value = 2,
            next = ListNode(
                value = 3,
                next = ListNode(4)
            )
        )
    )
    println(head)
    println(head2)

    println("reverse iteration: "+ reverseListIterative(head))
    println("reverse recursive: "+ reverseList(head2))
}


