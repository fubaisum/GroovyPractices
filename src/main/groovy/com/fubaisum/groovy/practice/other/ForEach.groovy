package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/19/16.
 */

String[] greetings = ['hello', 'Hi', 'Howdy']
// 使用 : 需要指明类型
for (String greet : greetings) {
    println greet
}

// 使用 in 不需要指明类型
for (greet in greetings) {
    println greet
}
