import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testSolution() {
        Assert.assertEquals(
                "Wrong result",
                "c-b-a",
                hypenJoin(listOf("a", "b", "c")))
    }
}