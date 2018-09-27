package de.exxcellent.kotlinworkshop._1_Basics

fun main(args: Array<String>) {
    // val: read-only
    val question: String =
        "life, the universe, and everything"
    // question = "Any questions"
    println("$question?")

    // var: mutable
    var answer: Int = -1
    answer = 42
    println(answer)

    // val is read-only reference, not object
    val languages = ArrayList<String>()
    languages.add("Kotlin")
}