package de.exxcellent.kotlinworkshop._12_Advanced


// vararg
fun printMany(vararg elements: Int) {
    for (element in elements) {
        println(element)
    }

    doSomething(*elements)
}


fun doSomething(vararg elements: Int) {
    for (element in elements) {
        println("Doing something $element")
    }
}

fun main(args: Array<String>) {
    // varargs
    printMany(1, 2, 3, 4, 5)
}


