package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/24/16.
 */
langs = ['C++': 'Stroustrup', 'Java': 'Gosling', 'Lisp': 'McCarthy']

println langs.getClass().name

println langs.'C++'
println langs.Java
println langs['Lisp']

langs.each { entry ->
    println "Language $entry.key was authored by $entry.value"
}

langs.each { key, value ->
    println "Language $key was authored by $value"
}