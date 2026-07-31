package beyond.sessionTwenty

fun main() {
    showName()
    showName("Android")

    showResult(numberTwo = 3, numberOne = 4)

    val result = returnResult(6, 9)
    println(result)

    singleExpressionFunction(3, 7)

    val android = Android()
    android.extensionShowInfoFunction()
}

fun showName(name: String = "Kotlin") {
    println(name)
}

fun showResult(numberOne: Int, numberTwo: Int) {
    println(numberOne + numberTwo)
}

fun returnResult(numberOne: Int, numberTwo: Int): Int {
    return numberOne + numberTwo
}

fun singleExpressionFunction(numberOne: Int, numberTwo: Int) = numberOne * numberTwo

fun Android.extensionShowInfoFunction() {
    println("$lang -> $os")
}