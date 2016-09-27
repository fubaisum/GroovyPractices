package com.fubaisum.groovy.practice.other

import groovy.transform.Canonical
import groovy.transform.Immutable

/**
 * Created by sum on 9/20/16.
 */

/**
 * @Canonical
 */
@Canonical(excludes = "age")
class Person {
    String firstName
    String lastName
    int age
}

def sara = new Person(firstName: "Sara", lastName: "Walker", age: 40)
println sara

/**
 * @Delegate
 */
class Worker {
    def work() {
        println 'get work done'
    }

    def analyze() {
        println 'analyze...'
    }

    def writeReport() {
        println 'get report written'
    }
}

class Expert {
    def analyze() {
        println 'expert analysis...'
    }
}

class Manager {
    @Delegate
    Expert expert = new Expert()
    @Delegate
    Worker worker = new Worker()
}

def bernie = new Manager()
bernie.analyze()
bernie.work()
bernie.writeReport()

/**
 * @Immutable
 */
@Immutable
class CreditCard {
    String cardNumber
    int creditLimit
}

println new CreditCard("4000-1111-2222-3333", 1000)

/**
 * @Lazy
 */
class Heavy {
    def size = 10

    Heavy() {
        println "Create Heavy with $size"
    }
}

class AsNeeded {
    def value

    @Lazy
    Heavy heavy1 = new Heavy()
    @Lazy
    Heavy heavy2 = { new Heavy(size: value) }()

    AsNeeded() {
        println 'Create AsNeeded'
    }
}

def asNeeded = new AsNeeded(value: 1000)
println asNeeded.heavy1.size
println asNeeded.heavy1.size
println asNeeded.heavy2.size

/**
 * @Newify
 */
@Newify([Person, CreditCard])
def fluentCreate() {
    println Person.new(firstName: "John", lastName: "Doe", age: 20)
    println Person(firstName: "John", lastName: "Doe", age: 20)
    println CreditCard("1234-5678-9999-0000", 2000)
}

fluentCreate()

/**
 * @Singleton
 */
@Singleton(lazy = true, strict = false)
class TheUnique {

    private TheUnique() {
        println 'Instance created'
    }

    def hello() {
        println 'hello'
    }
}

println "Accessing TheUnique"
TheUnique.instance.hello()
TheUnique.instance.hello()


