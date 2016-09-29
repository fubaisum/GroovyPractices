package com.fubaisum.groovy.practice.javainvoke

/**
 * Created by sum on 9/29/16.
 */
class AGroovyClass{
    def useClosure(closure) {
        println "Calling closure"
        closure()
    }

    def passToClosure(int value, closure) {
        println "Simply passing $value to the given closure"
    }
}