package com.fubaisum.groovy.practice.mop

/**
 * Created by sum on 10/12/16.
 */
Integer.metaClass.daysFromNow = {
    Calendar today = Calendar.instance
    today.add(Calendar.DAY_OF_MONTH, delegate)
    today.time
}
println 5.daysFromNow()



Integer.metaClass.'static'.isEven = { val -> val % 2 == 0 }
println "Is 2 even? " + Integer.isEven(2)
println "Is 3 even? " + Integer.isEven(3)


Integer.metaClass.constructor << { Calendar calendar ->
    new Integer(calendar.get(Calendar.DAY_OF_YEAR))
}
println new Integer(Calendar.instance)
