package de.exxcellent.kotlinworkshop._11Generics

import de.exxcellent.kotlinworkshop._Shared.Customer
import de.exxcellent.kotlinworkshop._Shared.CustomerRepository

interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}

fun main(args: Array<String>) {

    val customerRepo = CustomerRepository<Customer>()

    val customer = customerRepo.getById(10)
    val customers = customerRepo.getAll()


}
