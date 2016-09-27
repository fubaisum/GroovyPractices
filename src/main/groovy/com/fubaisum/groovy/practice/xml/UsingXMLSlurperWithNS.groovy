package com.fubaisum.groovy.practice.xml

/**
 * Created by sum on 9/25/16.
 */
String xmlFilePath = '/home/sum/IdeaProjects/Practice/src/main/resources/xml/ComputerAndNaturalLanguages.xml'
languages = new XmlSlurper().parse(xmlFilePath).declareNamespace(human: 'Natural')

println "Languages:"
println languages.language.collect { it.'@name' }.join(',')

println "Natural languages:"
println languages.'human:language'.collect { it.'@name' }.join(',')