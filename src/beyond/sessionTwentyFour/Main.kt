package beyond.sessionTwentyFour

fun main() {
    val numberBox = Box(42)
    val textBox = Box("Hello")

    println(numberBox)
    println(textBox)
}

class Box<T>(val value: T) {
    fun get(): T = value
}