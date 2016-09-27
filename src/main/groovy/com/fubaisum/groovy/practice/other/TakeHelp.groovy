package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/20/16.
 */
class Man {
    void helpMoveThings() {
        println "Man's helping"
    }
}

class Woman {
    void helpMoveThings() {
        println "Woman's helping"
    }
}

class Elephant {
    void helpMoveThings() {
        println "Elephant's helping"
    }

    void eatSugarcane() {
        println "I love sugarcane..."
    }
}

def takeHelpAndReward(helper) {
    helper.helpMoveThings()

    if (helper.metaClass.respondsTo(helper, 'eatSugarcane')) {
        helper.eatSugarcane()
    }
}

takeHelpAndReward(new Man())
takeHelpAndReward(new Woman())
takeHelpAndReward(new Elephant())