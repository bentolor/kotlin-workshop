package de.exxcellent.kotlinworkshop._2_Classes

import java.awt.Panel
import java.beans.PropertyChangeEvent
import java.beans.PropertyChangeListener

// Anonymous inner class
fun registerListener() {
    Panel().addPropertyChangeListener(
            object: PropertyChangeListener {
                override fun propertyChange(p0: PropertyChangeEvent?) {
                    println(p0)
                }
            }
            // SAM class -> can also be expressed as lambda
    )
}