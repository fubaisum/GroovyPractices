package com.fubaisum.groovy.practice.other
/**
 * Created by sum on 9/21/16.
 */
//@TypeChecked
//def shout(String str) {
//    println "Printing in uppercase"
//    println str.toUpperCase()
//    println "Printing again in uppercase"
//    println str.toUppercase()
//}

try {
    shout('hello')
} catch (ex) {
    println 'Failed...'
}

//@TypeChecked
//def shoutString(String str) {
//    println str.shout()
//}

str = 'hello'
str.metaClass.shout = { -> toUpperCase() }
shoutString(str)


def printInReverse(String str) {
    println str.reverse()
}

printInReverse 'hello'

def use(Object instance) {
    if (instance instanceof String) {
        println instance.length()
    } else {
        println instance
    }
}

use('hello')
use(4)