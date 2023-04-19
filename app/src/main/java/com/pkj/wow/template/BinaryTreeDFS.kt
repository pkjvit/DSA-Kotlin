package com.pkj.wow.template

import com.pkj.wow.DO_LOGIC
import com.pkj.wow.dsa.leetcode_blind75.tree.TreeNode
import java.util.*


fun binaryTreeDFSRecursion(node: TreeNode?): Int{
    if(node == null){
        return 0
    }

    var result = 0

    DO_LOGIC()

    binaryTreeDFSRecursion(node.leftChild)
    binaryTreeDFSRecursion(node.rightChild)

    return result
}

fun binaryTreeDFSIterative(node: TreeNode?): TreeNode?{
    val stack = Stack<TreeNode>()
    stack.push(node)

    while(stack.isNotEmpty()){
        val currentNode = stack.pop()

        DO_LOGIC()

        currentNode.leftChild?.let { stack.push(it) }
        currentNode.rightChild?.let { stack.push(it) }
    }


    return null
}
