package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/19/16.
 */

/**
 * 灵活初始化与具名参数
 */
class Robot {
    def type, height, width

    def access(Map location, weight, fragile) {
        println "Received fragile? $fragile, weight : $weight, loc : $location"
    }
}

robot = new Robot(type: 'arm', width: 10, height: 40)
println "$robot.type, $robot.height, $robot.width"

robot.access(x: 30, y: 20, z: 10, 50, true)
// 可以改变参数顺序
robot.access(50, true, x: 30, y: 20, z: 10)

/**
 * 可选形参
 */
// eg.1
def log(x, base = 10) {
    Math.log(x) / Math.log(base)
}

println log(1024)
println log(1024, 10)
println log(1024, 2)

// eg.2
def task(name, String[] details) {
    println "$name - $details"
}

task 'Call', '123-456-7890'
task 'Call', '123-456-7890', '234-123-132'
task 'Check Mail'

/**
 * 使用多赋值
 */
// eg.1
def splitName(fullName) {
    fullName.split(' ')
}

def (firstName, lastName) = splitName('James Bond')
println "$lastName, $firstName $lastName"

// eg.2
def name1 = "Thomson"
def name2 = "Thompson"

println "$name1 and $name2"
(name1, name2) = [name2, name1]
println "$name1 and $name2"

