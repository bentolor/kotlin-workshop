package de.exxcellent.kotlinworkshop._12_Advanced


class Outer {
    private val bar: Int = 1

    class Nested {
        fun foo() = 2
        // no access to parent
        // bar
    }
}

val outer = Outer.Nested().foo() // == 2




class OuterWithInner {
    private val bar: Int = 1

    inner class Inner {
        // implicit this-Pointer to OuterWithInner
        fun foo() = bar  // FQN: this@OuterWithInner.bar
    }
}

val outerWithInner = OuterWithInner().Inner().foo() // == 1


