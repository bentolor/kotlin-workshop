package de.exxcellent.kotlinworkshop._8Delegation

import de.exxcellent.kotlinworkshop._Shared.Customer

interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}

interface Logger {
    fun logAll()
}

class Controller(repository: Repository, logger: Logger) : Repository by repository, Logger by logger {


}