package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/18/16.
 */
def openFile(filename) {
    new FileInputStream(filename)
}

def fileName = "/home/sum/IdeaProjects/GroovyDemo/GroovyDem.iml"
try {
    openFile(fileName)
} catch (ex) {
    println ex
}