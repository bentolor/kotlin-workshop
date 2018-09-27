package de.exxcellent.kotlinworkshop._Shared

import de.exxcellent.kotlinworkshop._11Generics.Repository

class CustomerRepository<T> : Repository<T> {
    override fun getById(id: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}