open class Rectangle(val width:Int, val height:Int) {
    open fun describeMe(): String = "I'm a $width x $height large rectangle"
}

class Square(l: Int): Rectangle(l, l) {
    val length
        get() = width;
    override fun describeMe(): String = "I'm a square with each side $length long"
}