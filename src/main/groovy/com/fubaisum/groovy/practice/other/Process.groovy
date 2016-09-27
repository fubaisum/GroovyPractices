package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/18/16.
 */
println "ls -al".execute().getClass().name
println "ls -al".execute().text

String[] command = ['java', '-version']
println "Calling ${command.join(' ')}"
println command.execute().text