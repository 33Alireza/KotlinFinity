package infinity.typeSystem.smartCasts

fun printLength(x: Any) {
    if (x is String) {
        println(x.length)
    }
}

fun main() {
    printLength("Kotlin")
}