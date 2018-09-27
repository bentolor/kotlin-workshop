package de.exxcellent.kotlinworkshop._5_Lambdas

import java.awt.Panel
import java.beans.PropertyChangeEvent
import java.beans.PropertyChangeListener

// Anonymous inner class
fun registerListener() {
    Panel().addPropertyChangeListener(
            // can be expressed as SAM
            object: PropertyChangeListener {
                override fun propertyChange(p0: PropertyChangeEvent?) {
                    println(p0)
                }
            }
    )
}