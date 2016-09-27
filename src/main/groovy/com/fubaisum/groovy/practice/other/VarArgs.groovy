package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/20/16.
 */
def receiveVarArgs(int a, int ... b) {
    println "You passed $a and $b"
}

def receiveArray(int a, int[] b) {
    println "You passed $a and $b"
}

receiveVarArgs(1, 2, 3, 4, 5, 6)
receiveArray(1, 2, 3, 4, 5, 6, 7)

int[] values = [4, 5, 6, 7]
receiveVarArgs(1, values)
receiveVarArgs(1, [4, 5, 6, 7] as int[])
receiveArray(1, [4, 5, 6, 7] as int[])