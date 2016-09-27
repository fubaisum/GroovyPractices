package com.fubaisum.groovy.practice.rx

import rx.Observable

/**
 * Created by sum on 9/27/16.
 */
Observable.just(1, 2, 3, 4, 5, 6)
        .map() { a -> "s + " + a }
        .subscribe() {println it }