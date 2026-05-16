package beyond.sessionSix

fun main() {

    greetingMessage(prefix = "Log", message = "Hello")

}

fun greetingMessage(message: String, prefix: String) {
    println("$prefix $message")
}