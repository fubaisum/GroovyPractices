package com.fubaisum.groovy.practice.javainvoke

/**
 * Created by sum on 10/5/16.
 */
class DynamicGroovyClass {

    def methodMissing(String name, args) {
        println "methodMissing() : You called $name with ${args.join(', ')}."
        args.size()
    }

    def quack(String[] args) {
        println "quack() : You called quack with ${args.join(', ')}."
        args.size()
    }
}
