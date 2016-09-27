package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/24/16.
 */
lst = [1, 2]
lst.add(3)
lst.add(4)
println lst.size()
println lst.contains(2)

lst = [1, 2]
lst.with {
    add(3)
    add(4)
    println size()
    println contains(2)
}
lst.with {
    println "this is ${this}"
    println "owner is ${owner}"
    println "delegate is ${delegate}"
}
