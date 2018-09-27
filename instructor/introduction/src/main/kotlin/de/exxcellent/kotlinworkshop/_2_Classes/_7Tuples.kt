package de.exxcellent.kotlinworkshop._2_Classes


fun main(args: Array<String>) {

    val countryAndCity = Pair("Spain", "Madrid")

    countryAndCity.first
    countryAndCity.component1()

    val countryAndCityAndContinent = Triple("Spain", "Madrid", "Europe")

    println(countryAndCityAndContinent)
}