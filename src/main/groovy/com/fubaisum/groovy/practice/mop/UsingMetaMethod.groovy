package com.fubaisum.groovy.practice.mop

/**
 * Created by sum on 10/5/16.
 */
str = 'hello'
methodName = 'toUpperCase'
// 名字可能来自输入，而不是硬编码的

methodOfInterest = str.metaClass.getMetaMethod(methodName)
println methodOfInterest.invoke(str)

print "Does String respond to UpperCase()?"
println String.metaClass.respondsTo(str, methodName) ? 'yes' : 'no'

print "Does String respond to compareTo()?"
println String.metaClass.respondsTo(str, 'compareTo', 'testStr') ? 'yes' : 'no'

print "Does String respond to UpperCase()?"
println String.metaClass.respondsTo(str, methodName, 5) ? 'yes' : 'no'
