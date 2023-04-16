package com.pkj.wow.dsa.patterns.merge_intervals


fun merge(listOfPair: List<Pair<Int, Int>>): List<Pair<Int, Int>>{
    val result = ArrayList<Pair<Int,Int>>()
    val list = listOfPair.sortedWith(compareBy{it.first})

    println("PLOG: <top>->merge: $list")
    var pair = list[0]
    for(i in 1 until list.size){
        val current = list[i]
        if(pair.second >= current.first){
            pair = Pair(pair.first, maxOf(pair.second, current.second))
        }else{
            result.add(pair)
            pair = current
        }
    }
    result.add(pair)

    return result
}

fun mergeInsert(listOfPair: List<Pair<Int, Int>>, pairToAdd: Pair<Int,Int>): List<Pair<Int, Int>>{

    return merge(arrayListOf<Pair<Int, Int>>().apply { addAll(listOfPair);add(pairToAdd) })
    /*val result = ArrayList<Pair<Int,Int>>()
    val list = listOfPair.sortedWith(compareBy{it.first})

    println("PLOG: <top>->merge: $list")
    var pair = list[0]
    for(i in 1 until list.size){
        val current = list[i]
        if(pair.second >= current.first){
            pair = Pair(pair.first, maxOf(pair.second, current.second))
        }else{
            result.add(pair)
            pair = current
        }
    }
    result.add(pair)

    return result*/
}


fun main(){
    println("PLOG: <top>->main: ${merge(listOf(Pair(2,5), Pair(1,4), Pair(7,9)))}")
    println("PLOG: <top>->main: ${merge(listOf(Pair(6,7), Pair(2,4), Pair(5,9)))}")
    println("PLOG: <top>->main: ${merge(listOf(Pair(1,4), Pair(2,6), Pair(3,5)))}")

}