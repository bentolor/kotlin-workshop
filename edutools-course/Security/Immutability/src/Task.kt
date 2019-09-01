fun append42(input: List<Int>): List<Int> {
    val mutableList = input.toMutableList()
    mutableList += 42
    return mutableList;
}