package com.fubaisum.groovy.practice.other
/**
 * Created by sum on 9/25/16.
 */
def playWithSleep(flag) {
    thread = Thread.newInstance().start {
        println "Thread started"
        startTime = System.nanoTime()
        new Object().sleep(2000) {
            println "Interrupted...$it"
            flag
        }
        endTime = System.nanoTime()
        println "Thread done in ${(endTime - startTime) / 10**9} seconds"
    }

    thread.interrupt()
    thread.join()

}

playWithSleep(true)
playWithSleep(false)