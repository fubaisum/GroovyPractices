package com.fubaisum.groovy.practice.mop

/**
 * Created by sum on 10/11/16.
 */
Integer.metaClass.invokeMethod = { String name, args ->
    System.out.println("Call to $name intercepted on $delegate...")

    def validMethod = Integer.metaClass.getMetaMethod(name, args)
    if (validMethod == null) {
        Integer.metaClass.invokeMissingMethod(delegate, name, args)
    } else {
        System.out.println("running pre-filter...")
        result = validMethod.invoke(delegate, args)

        System.out.println("running post-filter...")
        result
    }
}

println 5.floatValue()
println 5.intValue()
try {
    println 5.empty()
} catch (ex) {
    println ex
}
