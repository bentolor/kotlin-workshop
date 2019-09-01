import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        Assert.assertEquals("You should append the value `42` to the passed list",
                listOf(1, 2, 3, 42),
                append42(listOf(1, 2, 3)))
    }
}