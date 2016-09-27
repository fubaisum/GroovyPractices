package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/25/16.
 */
def printThreadInfo(msg) {
    def currentThread = Thread.currentThread()
    println "$msg Thread is ${currentThread}. Deamon? ${currentThread.isDaemon()}"
}

printThreadInfo 'Main'

Thread.start {
    printThreadInfo 'Started'
    sleep(3000)
    println "Finished started"
}

sleep(1000)

Thread.startDaemon {
    printThreadInfo "Started Daemon"
    sleep(5000)
    println "Finished Started Daemon"// Never invoke
}

