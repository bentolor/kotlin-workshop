import org.junit.Assert
import org.junit.Test
import java.awt.Color

class Test {

    lateinit var stat: String
    lateinit var col: Color

    val sign = object: WeatherSign {
        override fun show(status: String, color: Color) {
            stat = status
            col = color
        }
    }

    @Test fun testJavaSolution() {
        val javaIndicator = WeatherIndicatorJava()
        testSolution(javaIndicator::rateWeather)
    }

    @Test fun testKotlinSolution() {
        val kotlinIndicator = WeatherIndicatorKt()
        testSolution(kotlinIndicator::rateWeather)
    }

    fun testSolution(implementation: (Int, WeatherSign) -> Unit) {
        implementation(1, sign)
        Assert.assertEquals("Color blue for 1", Color.BLUE, col)
        Assert.assertEquals("String 'Brrrrrr!' for 1", "Brrrrrr!", stat)

        implementation(-273, sign)
        Assert.assertEquals("Color blue for -273", Color.BLUE, col)
        Assert.assertEquals("String 'Brrrrrr!' for -273", "Brrrrrr!", stat)

        implementation(6, sign)
        Assert.assertEquals("Color orange for 6", Color.ORANGE, col)
        Assert.assertEquals("String 'Feels okay' for 6", "Feels okay", stat)

        implementation(20, sign)
        Assert.assertEquals("Color red for 20", Color.RED, col)
        Assert.assertEquals("String 'Holiday!' for 20", "Holiday!", stat)
    }
}