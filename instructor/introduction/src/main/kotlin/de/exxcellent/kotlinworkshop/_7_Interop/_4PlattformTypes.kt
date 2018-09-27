package de.exxcellent.kotlinworkshop._7_Interop

fun main(args: Array<String>) {

    // Java Code --> Plattform Type!
    println(System.getenv("PWD").toUpperCase())

    // Check at border
    // println(System.getenv("foo").toUpperCase())
    // Better Safe than Sorry
    println(System.getenv("foo")?.toUpperCase())

    val javaClass = JavaClassWithAnnotations()
    javaClass.mayReturnNull()?.toUpperCase()
    JavaClassWithAnnotations().expectsAValue("Foo"/*null*/)

}