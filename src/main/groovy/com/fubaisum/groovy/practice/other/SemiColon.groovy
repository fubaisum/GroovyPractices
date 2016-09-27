package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/20/16.
 */
class Semi {
    def val = 3

    ;
    {
        println "Instance initializer called..."
    }
}

println new Semi()