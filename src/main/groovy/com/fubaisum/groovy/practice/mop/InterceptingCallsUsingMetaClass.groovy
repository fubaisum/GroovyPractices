package com.fubaisum.groovy.practice.mop

/**
 * Created by sum on 10/11/16.
 */
class Car2{
    def check() {
        System.out.println "check called..."
    }

    def start() {
        System.out.println "start called..."
    }

    def drive() {
        System.out.println "drive called..."
    }
}

Car2.metaClass.invokeMethod = { String name,args ->
    System.out.println "Call to $name intercepted..."

    if (name != 'check') {
        System.out.println "running filter..."
        Car2.metaClass.getMetaMethod('check').invoke(delegate, null)
    }

    def validMethod = Car2.metaClass.getMetaMethod(name, args)
    if (validMethod) {
        validMethod.invoke(delegate, args)
    } else {
        Car2.metaClass.invokeMissingMethod(delegate, name, args)
    }
}

car = new Car2()
car.start()
car.drive()
car.check()
try {
    car.speed()
} catch (ex) {
    println ex
}