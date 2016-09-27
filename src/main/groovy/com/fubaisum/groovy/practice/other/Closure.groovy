package com.fubaisum.groovy.practice.other

/**
 * Created by sum on 9/22/16.
 */
/**
 * 传参
 * @param closure
 * @return
 */
def cal(closure) {
    closure 1, 2
}

cal() { a, b ->
    println a + b;
}

/**
 * 协程
 * @param n
 * @param closure
 * @return
 */
def iterate(n, closure) {
    1.upto(n) {
        println "In iterate with value ${it}"
        closure(it)
    }
}

println "Call iterate"
total = 0
iterate(4) {
    total += it;
    println "In closure total so far is $total"
}

/**
 * 科里化
 * @param closure
 * @return
 */
def tellFortunes(closure) {
    Date date = new Date()
    postFortune = closure.curry(date)
    postFortune "You day is filled with ceremony"
    postFortune "They're features, not bugs"
}

tellFortunes() { date, fortune ->
    println "Fortune for $date is $fortune"
}

/**
 * 动态
 * @param closure
 * @return
 */
def doSomething(closure) {
    if (closure) {
        closure()
    } else {
        println "Use the default implementation"
    }
}

doSomething() {
    println "Use specialize implementation"
}

doSomething()

def completeOrder(amount, taxComputer) {
    tax = 0
    if (taxComputer.maximumNumberOfParameters == 2) {
        tax = taxComputer(amount, 6.05)
    } else {
        tax = taxComputer(amount)
    }
    println "Scales tax is $tax"
}

completeOrder(100) {
    it * 0.0825
}
completeOrder(100) { amount, rate ->
    amount * (rate / 100)
}

def examine(closure) {
    println "$closure.maximumNumberOfParameters parameter(s) given"
    for (param in closure.parameterTypes) {
        println param.name
    }
}

examine() {}
examine() { it }
examine() { -> }
examine() { val -> }
examine() { Date val -> }
examine() { Date val, val2 -> }
examine() { Date val, String val2 -> }
