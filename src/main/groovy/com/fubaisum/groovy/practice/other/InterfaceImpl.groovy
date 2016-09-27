package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/19/16.
 */
interface Animal {
    void walk()

    void sleep()
}

// eg.1
testAnimal = [
        walk : { println 'walk' },
        sleep: { println 'sleep' }
]

Animal animal = testAnimal as Animal
animal.walk()
animal.sleep()

// eg.2
Animal animal2 = {
    println "ZZZ"
} as Animal
animal2.walk()
animal2.sleep()