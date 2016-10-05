package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/30/16.
 */
interface Listener {
    void a()

    void b()

    void c()
}

class ListenerHolder {
    Listener listener
}

listener = [
        a: { println "a" },
        b: { println "b" }
]

def listenerHolder = new ListenerHolder()
listenerHolder.setListener(listener as Listener)

listenerHolder.listener.a()
