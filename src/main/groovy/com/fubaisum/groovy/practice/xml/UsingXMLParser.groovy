package com.fubaisum.groovy.practice.xml

/**
 * Created by sum on 9/25/16.
 */
String xmlFilePath = '/home/sum/IdeaProjects/Practice/src/main/resources/xml/Languages.xml'
languages = new XmlParser().parse(xmlFilePath)

println "Languages and authors"

languages.each{
    println "${it.'@name'} authored by ${it.author[0].text()}"
}

def languagesByAuthor = { authorName ->
    languages.findAll{it.author[0].text() == authorName}.collect(){it.'@name'}.join(',')
}
println "Languages by Wirth : " + languagesByAuthor('Wirth')