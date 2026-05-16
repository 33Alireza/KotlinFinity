package infinity.functions.definingFunction

fun main() {

    val sumNumbers1 = sumNumbers1(10, 5)
    println(sumNumbers1)

    val b = sumNumbers1(10, 5) + 5
    println(b)

    val fullNameResult = showFullName("Alireza", "Yousefzadeh")
    println(fullNameResult)

}

fun sumNumbers1(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun showFullName(firstName: String, lastName: String) = "$firstName $lastName"