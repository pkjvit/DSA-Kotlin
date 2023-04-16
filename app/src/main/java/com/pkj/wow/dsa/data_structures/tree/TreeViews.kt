package com.pkj.wow.dsa.data_structures.tree

import com.pkj.wow.dsa.leetcode_blind75.tree.TreeNode
import java.util.TreeMap

val treeMap = TreeMap<Int, Int>()


fun topView(treeNode: TreeNode?, level: Int = 0) {
    // base condition
    if(treeNode == null){
        return
    }

    if(treeMap.contains(level).not()){
        treeMap.put(level, treeNode.value)
    }

    topView(treeNode.leftChild, level -1)
    topView(treeNode.rightChild, level +1)
}

fun bottomView(treeNode: TreeNode?, level: Int = 0){
    // base condition
    if(treeNode == null){
        return
    }

    treeMap.put(level, treeNode.value)

    bottomView(treeNode.leftChild, level-1)
    bottomView(treeNode.rightChild, level+1)

}

fun rightView(node: TreeNode?, level: Int = 0) {
    if(node == null){
        return
    }

    treeMap.put(level, node.value)

    rightView(node.leftChild, level+1)
    rightView(node.rightChild, level+1)
}

fun leftView(node: TreeNode?, level: Int = 0) {
    if(node == null){
        return
    }

    if(treeMap.contains(level).not()){
        treeMap.put(level, node.value)
    }

    leftView(node.leftChild, level+1)
    leftView(node.rightChild, level+1)
}


fun main(){
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


    topView(root)
    println("PLOG: <top view>->main: ${treeMap.values}")
    treeMap.clear()

    bottomView(root)
    println("PLOG: <bottom view>->main: ${treeMap.values}")
    treeMap.clear()

    leftView(root)
    println("PLOG: <left view>->main: ${treeMap.values}")
    treeMap.clear()

    rightView(root)
    println("PLOG: <right view>->main: ${treeMap.values}")
    treeMap.clear()

}


