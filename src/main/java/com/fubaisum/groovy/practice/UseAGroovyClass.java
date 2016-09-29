package com.fubaisum.groovy.practice;

import com.fubaisum.groovy.practice.javainvoke.AGroovyClass;

/**
 * Created by sum on 9/29/16.
 */
public class UseAGroovyClass {

    public static void main(String[] args) {
        AGroovyClass instance = new AGroovyClass();
        Object result = instance.useClosure(new Object() {
            public String call() {
                return "You called from Groovy!";
            }
        });

        System.out.println("Received: " + result);
    }
}
