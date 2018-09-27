package de.exxcellent.kotlinworkshop._2_Classes

import de.exxcellent.kotlinworkshop._Shared.Customer

// Interfaces in Kotlin are very similar to Java 8.
// They can contain declarations of abstract methods, as well as method implementations.
// But interfaces cannot store state. Properties need to be abstract or to provide accessors.
interface CustomerRepository {
    val isEmpty: Boolean
        get() = true

    fun store(obj: Customer) {
        // implement code to store
    }

    fun getById(id: Int): Customer
}

