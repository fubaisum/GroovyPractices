package com.fubaisum.groovy.practice.script

/**
 * Created by sum on 10/5/16.
 */
println "In Script2"
shell = new GroovyShell()
shell.evaluate(new File('Script1.groovy'))

evaluate(new File('Script1.groovy'))