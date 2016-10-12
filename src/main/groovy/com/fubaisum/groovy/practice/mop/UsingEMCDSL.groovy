package com.fubaisum.groovy.practice.mop

/**
 * Created by sum on 10/12/16.
 */
Integer.metaClass{
    daysFromNow = {
        Calendar today = Calendar.instance
        today.add(Calendar.DAY_OF_MONTH, delegate)
        today.time
    }

    getDaysFromNoew = {
        Calendar today = Calendar.instance
        today.add(Calendar.DAY_OF_MONTH, delegate)
        today.time
    }

    'static'{
        isEven = { val -> cal % 2 ==0 }
    }

    constructor = { Calendar calendar ->
        new Integer(calendar.get(Calendar.DAY_OF_YEAR))
    }

    constructor = { int val ->
        println "Intercepting constructor call"
        constructor = Integer.class.getConstructor(Integer.TYPE)
        constructor.newInstance(val)
    }
}

