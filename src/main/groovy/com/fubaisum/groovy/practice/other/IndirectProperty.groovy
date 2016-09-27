package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/25/16.
 */
class Car {
    int miles, fuelLevel
}

car = new Car(miles: 25, fuelLevel: 80)

properties = ['miles', 'fuelLevel']

properties.each { name ->
    println "$name = ${car[name]}"
}

car[properties[1]] = 100
println "fuelLevel now is ${car.fuelLevel}"

