package de.exxcellent.kotlinworkshop._3_AdvancedControlStructures


enum class Color {
    BLUE, ORANGE, RED
}

fun updateWeather(
        celsiusDegrees: Double
) {
    val description: String
    val color: Color
    when {
        celsiusDegrees < 0 -> {
            description = "cold"
            color = Color.BLUE
        }
        celsiusDegrees in 0..15 -> {
            description = "mild"
            color = Color.ORANGE
        }
        else -> {
            description = "hot"
            color = Color.RED
        }
    }
}

fun updateWeather1(celsiusDegrees: Double) {
    val (description, color) =
            when {
                celsiusDegrees < 0 -> Pair("cold", Color.BLUE)
                celsiusDegrees in 0..15 -> "mild" to Color.ORANGE
                else -> "hot" to Color.RED
            }
}