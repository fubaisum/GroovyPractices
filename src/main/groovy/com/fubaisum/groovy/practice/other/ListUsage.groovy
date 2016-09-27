package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/24/16.
 */
lst = [1, 3, 4, 1, 8, 9, 2, 6]
subLst = lst[2..5]
println subLst.dump()
subLst[0] = 55
println "After subLst = $subLst, lst = $lst"

lst.eachWithIndex { int entry, int i ->
    println "index = $i , entry = $entry"
}

/**
 * inject
 */
lst = ['Programming', 'In', 'Groovy']
print "Total length is "
println lst.inject(0) { carryOver, element -> carryOver + element.size() }

/**
 * flatten
 */
lst[0]= ['Be', 'Productive']
println lst
lst = lst.flatten()
println lst

/**
 *
 */
println lst.size()
println lst*.size()

def words(a, b, c, d) {
    println "$a $b $c $d"
}

words(*lst)
