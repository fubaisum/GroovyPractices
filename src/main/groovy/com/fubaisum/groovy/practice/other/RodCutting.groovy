package com.fubaisum.groovy.practice.other

import groovy.transform.Immutable

/**
 * Created by sum on 9/22/16.
 */
def timeIt(length, closure) {
    long start = System.nanoTime()
    println "Max revenue for $length is ${closure(length)}"
    long end = System.nanoTime()
    println "Time take ${(end - start) / 1.0e9} seconds"
}

def rodPrices = [0, 1, 3, 4, 5, 8, 9, 11, 12, 14,
                 15, 15, 16, 18, 19, 15, 20, 21, 22, 24,
                 25, 24, 26, 28, 29, 35, 37, 38, 39, 40]

def desiredLength = 27

@Immutable
class RevenueDetails {
    int revenue
    ArrayList splits
}

//def cutRod(prices, length) {
//    if (length == 0) {
//        new RevenueDetails(0, [])
//    } else {
//        def maxRevenueDetails = new RevenueDetails(Integer.MIN_VALUE, [])
//        for (rodSize in 1..length) {
//            def revenueFromSecondHalf = cutRod(prices, length - rodSize)
//            def potentialRevenue = new RevenueDetails(
//                    prices[rodSize] + revenueFromSecondHalf.revenue,
//                    revenueFromSecondHalf.splits + rodSize
//            )
//            if (potentialRevenue.revenue > maxRevenueDetails.revenue) {
//                maxRevenueDetails = potentialRevenue
//            }
//        }
//        maxRevenueDetails
//    }
//}

def cutRod
cutRod = { prices, length ->
    if (length == 0) {
        new RevenueDetails(0, [])
    } else {
        def maxRevenueDetails = new RevenueDetails(Integer.MIN_VALUE, [])
        for (rodSize in length..1) {
            def revenueFromSecondHalf = cutRod(prices, length - rodSize)
            def potentialRevenue = new RevenueDetails(
                    prices[rodSize] + revenueFromSecondHalf.revenue,
                    revenueFromSecondHalf.splits + rodSize
            )
            if (potentialRevenue.revenue > maxRevenueDetails.revenue) {
                maxRevenueDetails = potentialRevenue
            }
        }
        maxRevenueDetails
    }
}.memoize()

timeIt desiredLength, { length -> cutRod(rodPrices, length) }