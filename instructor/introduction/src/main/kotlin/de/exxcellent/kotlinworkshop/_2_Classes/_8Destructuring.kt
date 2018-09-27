@file:Suppress("UNUSED_VARIABLE")

package de.exxcellent.kotlinworkshop._2_Classes


fun main(args: Array<String>) {

    // Ctrl - Mouseover!
    val (country, city) = Pair("Spain", "Madrid")


    val (country1, city1, continent1) = Triple("Spain", "Madrid", "Europe")

    //  _ as "skip"
    val (_, age) = Person("Joe Smith", 42)

}