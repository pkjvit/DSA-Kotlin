package com.pkj.wow.dsa.algorithms

import java.util.LinkedList


data class Cache<K, T>(
    val key: K,
    val value: T?
)

interface LRUCache<K,T>{
    fun getElement(key: K):T?

    fun putElement(key: K, value: T?)
}

const val DEFAULT_CAPACITY = 4
class LRUCacheImpl(var capacity:Int? = DEFAULT_CAPACITY): LRUCache<Int, Int>{
    private val linkedList = LinkedList<Int>()
    private val map = mutableMapOf<Int, Cache<Int,Int>>()

    override fun getElement(key: Int): Int? {
        if(map.containsKey(key)){
            linkedList.remove(key)
            linkedList.addFirst(key)
            return map[key]!!.value
        }
        return null
    }

    override fun putElement(key: Int, value: Int?) {

        if(map.containsKey(key)){
            linkedList.remove(key)
            map.remove(key)
        }else{
            if(linkedList.size == capacity) {
                val lastRemoved = linkedList.removeLast()
                map.remove(lastRemoved)
            }
        }
        val cacheItem = Cache(key, value)
        linkedList.addFirst(key)
        map.put(key, cacheItem)
    }


}




fun main(){

}