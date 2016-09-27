package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/19/16.
 */

// ++
println '++ : '
for (ch = 'a'; ch < 'f'; ch++) {
    println ch
}

// ..
println '.. : '
for (ch in 'a'..'g') {
    println ch
}

// <<
println '<< : '
lst = ['hello']
lst << 'there'
println lst

