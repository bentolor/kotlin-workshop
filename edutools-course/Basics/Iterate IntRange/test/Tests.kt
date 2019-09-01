import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        Assert.assertEquals("Wrong result for [5, 1, 2]",
                countDown(5, 1, 2), listOf(5, 3, 1)
        )
        Assert.assertEquals("Wrong result for [12, -3, 3]",
                countDown(12, -3, 3),
                listOf(12, 9, 6, 3, 0, -3))
    }
}