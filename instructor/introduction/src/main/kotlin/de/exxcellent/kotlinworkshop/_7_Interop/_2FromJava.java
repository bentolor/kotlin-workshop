package de.exxcellent.kotlinworkshop._7_Interop;

import de.exxcellent.kotlinworkshop._1_Basics._2FunctionsKt;
import de.exxcellent.kotlinworkshop._Shared.Customer;

public class _2FromJava {

    public static void main(String[] args) {

        Customer customerKotlin = new Customer(1, "Mary Jane");

        //
        int result = _2FunctionsKt.max(2, 3);

    }
}
