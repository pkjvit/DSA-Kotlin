package com.pkj.wow.template

import java.util.*

fun graphBFS(graph: Array<IntArray>, start: Int): Int{
    val seen = mutableSetOf<Int>()
    val queue = LinkedList<Int>()
    var result = 0
    queue.add(start)
    seen.add(start)
    while(queue.isNotEmpty()){
        val node = queue.pop()

        result++
        print("${node+1} -> ")
        for(neighbor in 0 until graph[node].size){
            if(graph[node][neighbor] == 0) continue

            if(seen.contains(neighbor).not()){
                queue.add(neighbor)
                seen.add(neighbor)
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

    println("PLOG: <top>->main: ${graphBFS(graph, 0)}")
}