package com.pkj.wow.dsa.data_structures.tree

import com.pkj.wow.dsa.leetcode_blind75.linked_list.ListNode
import com.pkj.wow.dsa.leetcode_blind75.tree.TreeNode



fun inOrder(node: TreeNode?){
    if(node == null){
        return
    }

    inOrder(node.leftChild)
    print(node.value)
    inOrder(node.rightChild)
}

fun postOrder(node: TreeNode?) {
    if(node == null)
        return

    postOrder(node.leftChild)
    postOrder(node.rightChild)
    print(node.value)
}

fun preOrder(node: TreeNode?) {
    if(node == null)
        return

    print(node.value)
    preOrder(node.leftChild)
    preOrder(node.rightChild)
}


fun main() {
    val root = TreeNode(1)
    root.leftChild = TreeNode(2)
    root.rightChild = TreeNode(3)
    root.leftChild?.rightChild = TreeNode(4)
    root.leftChild?.rightChild?.leftChild = TreeNode(5)

    /*
            1
        2       3
            4
        5
     */

    print("PLOG: <in-order>->main: ")
    inOrder(root)

    println()
    print("PLOG: <pre-order>->main: ")
    preOrder(root)

    println()
    print("PLOG: <post-order>->main: ")
    postOrder(root)

}


