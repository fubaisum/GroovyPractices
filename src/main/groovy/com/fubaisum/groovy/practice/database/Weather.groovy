package com.fubaisum.groovy.practice.database

import groovy.sql.Sql
import groovy.xml.MarkupBuilder

/**
 * Created by sum on 9/27/16.
 */
def sql = Sql.newInstance('jdbc:mysql://localhost:3306/weatherinfo',
        'root', '2009006971', 'org.mariadb.jdbc.Driver')

println sql.connection.catalog

println "City           Temperature"
sql.eachRow('select * from weather') {
    printf "%-20s%s\n", it.city, it[1]
}

processMeta = { metaData ->
    metaData.columnCount.times { i ->
        printf "%-16s", metaData.getColumnLabel(i + 1)
    }
    println ""
}

sql.eachRow('select * from weather', processMeta) {
    printf "%-20s%s\n", it.city, it[1]
}


bldr = new MarkupBuilder()

bldr.weather {
    sql.eachRow('select * from weather') {
        city(name: it.city, temperature: it.temperature)
    }
}

//dataSet = sql.dataSet('weather')
//citiesBelowFreezing = dataSet.findAll { it.temperature < 32 }
//println "Cities below freezing"
//println citiesBelowFreezing.dump()
//citiesBelowFreezing.each() { it ->
//    println it.city
//}