package de.exxcellent.kotlinworkshop._2_Classes

class AnotherRectangle(val height: Int, val width: Int) {

    // you can redefine getter (and setter)
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main(args: Array<String>) {
    val rectangle = AnotherRectangle(41, 43)
    println(rectangle.isSquare)

    val counter = Counter()
    counter.increment()
    //value.value += 1
    println(counter.value)
}

class Counter {
    var value: Int = 0
        private set
        //private set(v) { value = v }

    fun increment() = value++
}