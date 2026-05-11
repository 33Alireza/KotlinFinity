package infinity.functions.namedArguments

fun printMessageWithPrefix(message: String, prefix: String) {

    println("[$prefix] $message")

}

fun main() {

    printMessageWithPrefix(prefix = "Log", message = "Hello")

}