package com.pkj.wow.template

import com.pkj.wow.DO_LOGIC
import com.pkj.wow.dsa.leetcode_blind75.tree.TreeNode
import java.util.*
import kotlin.collections.ArrayDeque


fun binaryTreeBFS(node: TreeNode) : Int{
    var result = 0
    val queue = LinkedList<TreeNode>()
    queue.add(node)

    while(queue.isNotEmpty()){

        var queueSize = queue.size
        DO_LOGIC()// on current level

        for(i in 0 until queueSize){
            val currentNode = queue.pop()

            DO_LOGIC() // while traversing node

            currentNode.leftChild?.let { queue.add(it) }
            currentNode.rightChild?.let { queue.add(it) }
        }
    }

    return result
}