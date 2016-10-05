package com.fubaisum.groovy.practice.mop

/**
 * Created by sum on 10/5/16.
 */
def printInfo(obj) {
    // 假定用户从标准输入键入这些值
    usrRequestedProperty = 'bytes'
    usrRequestedMethod = 'toUpperCase'

    println obj[usrRequestedProperty]
    //or
    println obj."$usrRequestedProperty"

    println obj."$usrRequestedMethod"()
    //or
    println obj.invokeMethod(usrRequestedMethod, null)

}

printInfo('hello')

println "Properties of 'hello' are: "
'hello'.properties.each {println it}