
fun countDown(first: Int, last: Int, increment: Int): List<Int> {
    val result = ArrayList<Int>()
    for (i in first downTo last step increment)
        result.add(i)
    return result
}
