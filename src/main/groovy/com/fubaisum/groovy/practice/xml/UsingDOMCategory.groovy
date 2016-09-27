package com.fubaisum.groovy.practice.xml

import groovy.xml.DOMBuilder
import groovy.xml.dom.DOMCategory

/**
 * Created by sum on 9/25/16.
 */
String xmlFilePath = '/home/sum/IdeaProjects/Practice/src/main/resources/xml/Languages.xml'
document = DOMBuilder.parse(new FileReader(xmlFilePath))

rootElement = document.documentElement

use(DOMCategory) {
    println "Languages and authors"
    languages = rootElement.language
    languages.each { language ->
        println "${language.'@name'} authored by ${language.author[0].text()}"
    }

    def languagesByAuthor = { authorName ->
        languages.findAll { it.author[0].text() == authorName }.collect() { it.'@name' }.join(',')
    }
    println "Languages by Wirth:" + languagesByAuthor('Wirth')
}

