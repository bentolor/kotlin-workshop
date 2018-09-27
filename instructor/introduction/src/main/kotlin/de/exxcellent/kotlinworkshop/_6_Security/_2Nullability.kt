package de.exxcellent.kotlinworkshop._6_Security

var nonNullable: String = "always not null"
var nullable: String? = null
val l1: Int = nonNullable.length // nullable.length

fun main(args: Array<String>) {
    // Elvis
    println(nullable?.toUpperCase())

    // Elvis with fallbakc value
    println(nullable?.toUpperCase() ?: "")


    // Elvis with Exception
    println(nullable?.toUpperCase() ?: throw IllegalStateException("Nah!"))

    // Smart Cast on effective finals
    var s = nullable
    if (s != null) {
        println(s.toUpperCase())
    }

    nullableExtensions(null)

    // I-know it better
    println(nullable!!.toUpperCase())
}

fun nullableExtensions(nullValue: String?) {
    // Many Kotlin Extensions are null-safe: No NPE here!
    println(nullValue.equals("foo"))
    println(nullValue.toString())
}
