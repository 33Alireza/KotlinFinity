package functions.defaultParameterValues

fun printMessageWithPrefixValues(message: String, prefix: String = "advancedKotlinFeatures.generics.Info") {

    println("[$prefix] $message")

}

fun main() {

    printMessageWithPrefixValues("Hello", "Log")

    println()

    printMessageWithPrefixValues("Hello")

    println()

    printMessageWithPrefixValues(prefix = "Log", message = "Hello")

}