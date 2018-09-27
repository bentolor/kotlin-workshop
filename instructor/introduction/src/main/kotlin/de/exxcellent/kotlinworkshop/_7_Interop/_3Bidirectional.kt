package de.exxcellent.kotlinworkshop._7_Interop


fun main(args: Array<String>) {

    // Bidirectional Code Usage
    KotlinClass(JavaClass()).callJavaClassMethod()
}

// inbound reference from JavaClass
class KotlinClass(val jclass: JavaClass) {
    fun callJavaClassMethod() {
        // outbound reference to javaClass
        jclass.printInJavaClass("Kotlin got: ${jclass.valueFromJavaClass}" )
    }
}