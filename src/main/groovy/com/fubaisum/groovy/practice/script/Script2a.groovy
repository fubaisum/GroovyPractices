package com.fubaisum.groovy.practice.script

/**
 * Created by sum on 10/5/16.
 */
println "In Script2"

name = "Venkat"

shell = new GroovyShell(binding)

result = shell.evaluate(new File('Script1a.groovy'))

println "Scriptla returned : $result"
println "Hello $name"