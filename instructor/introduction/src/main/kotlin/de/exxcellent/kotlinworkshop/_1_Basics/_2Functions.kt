package de.exxcellent.kotlinworkshop._1_Basics


fun max(a: Int, b: Int): Int {
    return if (a < b) a else b          // if = expression
}



// expression form
fun max2(a: Int, b: Int) = if (a < b) a else b



// default values for arguments
fun sum(a: Int, b: Int, c: Int = 0) = a + b + c



fun main(args: Array<String>) {
    // default values
    sum(1, 2)
    sum(1, 2, 3)

    // named arguments
    sum(b = 2, a = 1)
}


