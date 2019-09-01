import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        val rec = Rectangle(10, 15);
        Assert.assertEquals("I'm a 10 x 15 large rectangle", rec.describeMe())
        Assert.assertEquals(10, rec.width)
        Assert.assertEquals(15, rec.height)

        val square = Square(7)
        Assert.assertEquals("I'm a square with each side 7 long", square.describeMe())
        Assert.assertEquals(7, square.width)
        Assert.assertEquals(7, square.height)
        Assert.assertEquals(7, square.length)
        Assert.assertTrue(Square(42) is Rectangle)
    }
}