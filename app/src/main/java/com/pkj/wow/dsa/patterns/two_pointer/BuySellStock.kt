package com.pkj.wow.dsa.patterns.two_pointer

/**
 *  input : 7,1,5,3,6,4
 *  output : 5  // buy on 2nd day (1) and sell on 5th day (6)
 */
fun maxProfit(price: IntArray) : Int{
    var max = 0
    var left = 0

    for(right in 1 until price.size){
        val profit = price[right] - price[left]
        if(price[left] > price[right]){
            left = right
        }else{
            max = Math.max(max, profit)
        }
    }

    return max
}

fun maxProfitBestSolution(prices: IntArray): Int {
    var maxProfit = 0
    var minCost = prices[0]
    for (i in prices) {
        if (minCost >= i) {
            minCost = i
        } else {
            if (maxProfit < (i - minCost)){
                maxProfit = (i - minCost)
            }
        }
    }
    return maxProfit
}

fun main() {
    println(maxProfit(arrayOf(7,1,5,3,6,4).toIntArray()))
    println(maxProfitBestSolution(arrayOf(7,1,5,3,6,4).toIntArray()))
}