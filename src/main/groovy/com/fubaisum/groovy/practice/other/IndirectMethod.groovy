package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/25/16.
 */
class Human {
    def walk() {
        println "Walking ..."
    }

    def walk(int miles) {
        println "Walking $miles miles..."
    }

    def walk(int miles, String where) {
        println "Walking $miles miles $where ..."
    }
}

peter = new Human()

peter.invokeMethod("walk", null)
peter.invokeMethod("walk", 10)
peter.invokeMethod("walk", [2, 'uphill'])