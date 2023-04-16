package com.pkj.wow.dsa.leetcode_blind75.dynamic_programming


fun coinChange(coins: IntArray, amount:Int):Int{

    val dp = IntArray(amount+1){ amount+1 }
    dp[0] = 0

    for(a in 1 until dp.size){
        for(coin in coins){
            if(a - coin >= 0){
                dp[a] = minOf(dp[a], 1 + dp[a-coin])
            }else{
                break
            }
        }
    }

    return if(dp[amount] == amount+1) -1 else dp[amount]
}



fun main(){
    println("coin change: ${coinChange(intArrayOf(1,2,3,4,5),7)}")
}