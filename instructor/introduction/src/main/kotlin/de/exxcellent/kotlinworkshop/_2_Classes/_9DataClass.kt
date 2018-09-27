package de.exxcellent.kotlinworkshop._2_Classes

// Adding data makes the compiler generate useful methods
// such as equals, hashCode, toString, componentN.
data class Person(
        val name: String,
        val age: Int)

fun main(args: Array<String>) {
    val person1 = Person("Alice", 21)
    val person2 = Person("Alice", 21)
    println(person1)
    println(person1 == person2)

    // Destructuing via component1() & component2()
    var (name, age) = person1
    println("$name is $age years old")

    val person3 = person2.copy(age = 32)
    println(person3)
}