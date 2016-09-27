package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/19/16.
 */

// eg.1
enum CoffeeSize {
    SHORT, SMALL, MEDIUM, LARGE, MUG
}

def orderCoffee(CoffeeSize size) {
    switch (size) {
        case [CoffeeSize.SHORT, CoffeeSize.SMALL]:
            println "you're health conscious"
            break
        case CoffeeSize.MEDIUM..CoffeeSize.LARGE:
            println "you gotta be a programmer"
            break
        case CoffeeSize.MUG:
            println "you should try Caffeine IV"
            break
    }
}
orderCoffee(CoffeeSize.SMALL)
orderCoffee(CoffeeSize.LARGE)
orderCoffee(CoffeeSize.MUG)

// eg.2
enum Methodologies {
    Evo(5),
    XP(21),
    Scrum(30)

    final int daysInIteration

    Methodologies(days) {
        daysInIteration = days
    }

    def iterationDetails() {
        println "${this} recommands $daysInIteration days for iteration"
    }
}

for (methodology in Methodologies.values()) {
    methodology.iterationDetails()
}