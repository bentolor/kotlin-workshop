package de.exxcellent.kotlinworkshop._1_Basics

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")

    // ${}

    // println("Double char count: ${name.length * 2}")
}
