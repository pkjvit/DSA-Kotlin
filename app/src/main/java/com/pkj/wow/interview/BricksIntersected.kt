package com.pkj.wow.interview


fun leastBricks(walls: List<IntArray>): Int{
    var result = 0
    val map = mutableMapOf<Int, Int>()

    for( wall in walls){
        var width = 0
        for(i in 0 until wall.size-1){
            width += wall[i]
            map.put(width, map.getOrDefault(width, 0)+1)
            result = maxOf(result, map.getOrDefault(width, 0))
        }
    }

    return walls.size - result
}



fun main(){
    val arr: ArrayList<IntArray> = ArrayList()
    arr.add(intArrayOf(1, 2, 2, 1))
    arr.add(intArrayOf(3, 1, 2))
    arr.add(intArrayOf(1, 3, 2))
    arr.add(intArrayOf(2, 4))
    arr.add(intArrayOf(3, 1, 2))
    arr.add(intArrayOf(1, 3, 1, 1))

    println("PLOG: <top>->main: ${leastBricks(arr)}")

    val arr2: ArrayList<IntArray> = ArrayList()
    arr2.add(intArrayOf(1, 2, 2, 1))
    arr2.add(intArrayOf(3, 1, 2))
    arr2.add(intArrayOf(1, 3, 2))
    arr2.add(intArrayOf(1,1, 4))
    arr2.add(intArrayOf(1, 3, 2))
    arr2.add(intArrayOf(1, 3, 1, 1))

    println("PLOG: <top>->main: ${leastBricks(arr2)}")
}