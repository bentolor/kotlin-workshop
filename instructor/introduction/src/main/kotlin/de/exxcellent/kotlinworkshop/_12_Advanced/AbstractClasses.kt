package de.exxcellent.kotlinworkshop._12_Advanced


abstract class StoredEntity {
    val isActive = true
    abstract fun store()
    fun status(): String {
        return isActive.toString()
    }

}

class Employee : StoredEntity() {
    override fun store() {
        throw TODO()
    }

}


fun main(args: Array<String>) {
    val se = Employee()
    se.isActive
    se.status()
}