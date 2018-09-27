import org.junit.Assert.assertEquals
import org.junit.Test

class Test {
    @Test fun testSolution() {
        assertEquals("Wrong result", countDown(5, 1, 2), listOf(5,3,1))
        assertEquals("Wrong result", countDown(12, -3, 3), listOf(12, 9, 6, 3, 0, -3))
    }
}