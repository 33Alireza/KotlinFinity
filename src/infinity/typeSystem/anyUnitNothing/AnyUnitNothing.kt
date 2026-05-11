package infinity.typeSystem.anyUnitNothing

fun demo(x: Any): Unit {
    println(x)
}

fun crash(): Nothing {
    throw Exception("Boom!")
}

fun main() {
    demo("Kotlin")
    crash()
}