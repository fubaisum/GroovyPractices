package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/18/16.
 */

// range 0..n
println ''
println 'range :'
for (i in 0..9) {
    print i
}

// upto
println ''
println 'upto :'
0.upto(9) { print it }

// times
println ''
println 'times :'
3.times { print it }

// step
println ''
println 'step :'
0.step(10,2){
    print it
}




