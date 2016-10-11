package com.fubaisum.groovy.practice.mop

/**
 * Created by sum on 10/11/16.
 */
class Car implements GroovyInterceptable {
    def check() {
        System.out.println "check called..."
    }

    def start() {
        System.out.println "start called..."
    }

    def drive() {
        System.out.println "drive called..."
    }

    @Override
    Object invokeMethod(String name, Object args) {
        System.out.println "Call to $name intercepted..."

        if (name != 'check') {
            System.out.println "running filter..."
            Car.metaClass.getMetaMethod('check').invoke(this, null)
        }

        def validMethod = Car.metaClass.getMetaMethod(name, args)
        if (validMethod) {
            validMethod.invoke(this, args)
        } else {
            Car.metaClass.invokeMethod(this, name, args)
        }
    }
}

car = new Car()
car.start()
car.drive()
car.check()
try {
    car.speed()
} catch (ex) {
    println ex
}