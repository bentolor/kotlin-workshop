fun hypenJoin(elements: Iterable<String>): String {
    var value = ""
    for (e in elements) {
        value = if (value.isEmpty()) e else "$e-$value"
    }
    return value
}