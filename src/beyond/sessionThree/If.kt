package beyond.sessionThree

fun main() {

    val numberOne = 4
    val numberTwo = 3

    if (numberOne > numberTwo) {
        println("$numberOne > $numberTwo")
    } else {
        println("$numberOne < $numberTwo")
    }

    val languageName = "Kotlin"
    val operatingSystemName = "Android"
    val trueValue = true
    val falseValue = false

    if (languageName == operatingSystemName) {
        println(trueValue)
    } else {
        println(falseValue)
    }

    val biggestNumber = if (numberOne > numberTwo) {
        numberOne
    } else {
        numberTwo
    }
    println(biggestNumber)

    if (numberOne == 0) {
        println("Zero")
    } else if (numberOne == 2) {
        println("Two")
    } else if (numberOne == 4) {
        println("Four")
    }
}