package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/24/16.
 */
/**
 * eg.1
 */
quote = "Today ${-> company} stock closed ad ${-> price}"

stocks = [Apple: 663.01, Microsoft: 30.95]

stocks.forEach() { key, value ->
    company = key
    price = value
    println quote
}

/**
 * eg.2
 */
memo = '''Hello world!
TTTTTTTTTTTTTTTTTTTTTTTTTT
DDDDDDDDDDDDDDDDDDDDDDDDDD
'''

println memo

/**
 * eg.3
 */
str = "It's a rainy day in Seattle"
println str

str -= "rainy"
println str

str += "."
println str

str++
println str

