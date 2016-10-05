package com.fubaisum.groovy.practice;

import com.fubaisum.groovy.practice.javainvoke.DynamicGroovyClass;

/**
 * Created by sum on 10/5/16.
 */
public class CallDynamicMethod {
    public static void main(String[] args) {
        groovy.lang.GroovyObject instance = new DynamicGroovyClass();

        Object result1 = instance.invokeMethod("squeak", new Object[]{"like", "a", "duck"});
        System.out.println("Received : " + result1);

        Object result2 = instance.invokeMethod("quack", new Object[]{"like", "a", "duck"});
        System.out.println("Received : " + result2);
    }
}
