package de.exxcellent.kotlinworkshop._1_Basics


fun noTypeInfer(vals: List<Int>): Unit {
    val distinct: Set<Int> = vals.toSet()
    val first: Int = vals[0]
    val negs: List<Int> = vals.filter(
            fun(n: Int): Boolean {
                return n < 0
            }
    )
    //return Triple(distinct, first, negs)
}


fun main(args: Array<String>) {
    var answer = 42
    // answer = 2.2
    // answer = "no answer"

    noTypeInfer(listOf(answer, 2))


    // express type in literals
    val myInt = 100
    val myDouble = 1.2
    val myLong = 10L
    val myFloat = 100F
    val myHex = 0x0F


    // IDEA Tip: show type hints

    // Kotlin stdl lib helper extensions
    val myLongAgain : Long = myInt.toLong()
}