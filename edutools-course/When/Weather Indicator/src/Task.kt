import java.awt.Color

class WeatherIndicatorKt {
    fun rateWeather(celsius: Int, sign: WeatherSign) {
        val (status, color) = when {
            celsius < 5 -> "Brrrrrr!" to Color.BLUE
            celsius in 5 until 20 -> "Feels okay" to Color.ORANGE
            else -> "Holiday!" to Color.RED
        }
        sign.show(status, color)
    }
}