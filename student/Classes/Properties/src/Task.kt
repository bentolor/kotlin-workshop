class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int = -1
        set(v: Int) {
            field = v
            counter++
        }
}
