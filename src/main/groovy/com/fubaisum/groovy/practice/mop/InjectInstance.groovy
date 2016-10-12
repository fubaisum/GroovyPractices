package com.fubaisum.groovy.practice.mop

/**
 * Created by sum on 10/12/16.
 */
class Person {
    def play() { println 'playing...' }
}

def emc = new ExpandoMetaClass(Person)
emc.sing = {
    'oh baby baby...'
}
emc.initialize()

def jack = new Person()
def paul = new Person()

jack.metaClass = emc
println jack.sing()

try {
    paul.sing()
} catch (ex) {
    println ex
}

jack.metaClass = null
try {
    jack.sing()
    paul.sing()
} catch (ex) {
    println ex
}

/**
 * 可以不创建ExpandoMetaClass
 */
jack.metaClass.sing = {
    'oh baby baby...'
}
println jack.sing()

jack.metaClass {
    sing = {
        'oh baby baby...'
    }
    dance = {
        'start the music...'
    }
}