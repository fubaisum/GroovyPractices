package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/22/16.
 */
def factorial

factorial = { int number, BigInteger theFactorial ->
    number == 1 ? theFactorial :
            factorial.trampoline(number - 1, number * theFactorial)
}.trampoline()

println "factorial of 5 is ${factorial(5, 1)}"
println "Number of bits in the result is ${factorial(500, 1).bitCount()}"