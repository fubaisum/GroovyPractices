package com.fubaisum.groovy.practice.xml

import groovy.xml.StreamingMarkupBuilder

/**
 * Created by sum on 9/25/16.
 */
langs = ['C++': 'Stroustrup', 'Java': 'Gosling', 'Lisp': 'McCarthy']

xmlDocument = new StreamingMarkupBuilder().bind() {
    mkp.xmlDeclaration()
    mkp.declareNamespace(computer: "Computer")
    languages {
        comment << "Create using StreamingMarkupBuilder"
        langs.each { key, value ->
            computer.language(name: key) {
                author(value)
            }
        }
    }
}

println xmlDocument