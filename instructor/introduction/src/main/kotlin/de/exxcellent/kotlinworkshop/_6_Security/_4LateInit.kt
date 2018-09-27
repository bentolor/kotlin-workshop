package de.exxcellent.kotlinworkshop._6_Security

import kotlin.properties.Delegates


fun main(args: Array<String>) {
    // Delegate und lateinit
    val view = AndroidView()
    view.onCreate()
    view.doView()
}



class AndroidView {
    lateinit var nonNullable: String
    var otherNonNullable: String by Delegates.notNull()

    fun onCreate() {
        nonNullable = "Foo"
        otherNonNullable = "Bar"
    }

    fun doView() {
        println(nonNullable)
        println(otherNonNullable)
    }
}