package com.pkj.wow.template

import java.util.*


val seen = mutableSetOf<Int>()

fun graphDFSRecursion(graph: Array<IntArray>, start: Int): Int{
    var result = 1
    for(neighbor in 0 until  graph[start].size){
        if(graph[start][neighbor] == 0) continue
        if(seen.contains(neighbor).not()){

            seen.add(neighbor)
            print("${neighbor+1} -> ")
            result += graphDFSRecursion(graph, neighbor)
        }
    }
    return result
}


fun graphDFSIterative(graph: Array<IntArray>, start: Int): Int{
    seen.clear()

    val stack = Stack<Int>()
    var result = 0
    stack.push(start)

    while(stack.isNotEmpty()){
        val node = stack.pop()
        seen.add(node)
        result++
        print("$node -> ")
        for(neighbor in 0 until graph[node].size){
            if(graph[node][neighbor] == 0) continue

            if(seen.contains(neighbor).not()){
                stack.push(neighbor)
            }
        }
    }

    return result

}

fun main(){
    var graph: Array<IntArray> = arrayOf(
        intArrayOf(0, 0, 1, 1, 0),
        intArrayOf(1, 0, 0, 1, 0),
        intArrayOf(0, 0, 0, 1, 0),
        intArrayOf(0, 0, 0, 0, 1),
        intArrayOf(0, 1, 0, 0, 0),
    )
    seen.add(0)

    println("PLOG: <top>->main: ${graphDFSRecursion(graph, 0)}")
    println("PLOG: <top>->main: ${graphDFSIterative(graph, 0)}")
}