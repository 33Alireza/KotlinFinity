package beyond.sessionSix

fun main() {

    printMessageWithDefaultParameterValue(prefix = "Log")
    printMessageWithDefaultParameterValue(message = "Ciao", prefix = "Log")

}

fun printMessageWithDefaultParameterValue(message: String = "Hello", prefix: String) {
    println("$message, $prefix")
}