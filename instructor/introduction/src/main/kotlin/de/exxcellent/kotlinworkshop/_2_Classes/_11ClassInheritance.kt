package de.exxcellent.kotlinworkshop._2_Classes


open class Animal {
    open fun validate() {
        TODO()
    }
}

open class FunnyAnimal : Animal() {
    final override fun validate() {
    }
}

class SpecialAnimal : FunnyAnimal() {
    // override fun validate() { }
}

data class CustomerAnimal(val name: String) : Animal()

fun main(args: Array<String>) {

    val customer = FunnyAnimal()

    customer.validate()
}