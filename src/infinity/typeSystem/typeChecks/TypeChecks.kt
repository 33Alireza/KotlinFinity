package infinity.typeSystem.typeChecks

fun main() {

    val value: Any = "Kotlin"

    if (value is String) {
        println("String length is ${value.length}")
    }
    if (value !is Int) {
        println("Not an Int!")
    }

}