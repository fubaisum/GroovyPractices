package com.fubaisum.groovy.practice.mop

/**
 * Created by sum on 10/12/16.
 */
class Helper {
    def static toString(String self) {
        def method = self.metaClass.methods.find() {
            it.name == 'toString'
        }
        '!!' + method.invoke(self, null) + '!!'
    }
}

use(Helper){
    println 'hello'.toString()
}