package infinity.functions.definingFunction

fun main() {

    val sumNumbers1 = sumNumbers1(10, 5)
    println(sumNumbers1)

    println()

    val b = sumNumbers1(10, 5) + 5
    println(b)
}

fun sumNumbers1(number1: Int, number2: Int) : Int{
    return number1 + number2
}