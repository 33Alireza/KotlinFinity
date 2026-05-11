package infinity.controlFlow.`if`

fun main() {

    val a = 5
    val b = 8

    if (a <= b) {
        println("$a is bigger")
    } else if (a == b) {
        println("Both numbers are equal")
    } else {
        println("$a is smaller")
    }

    println()

    val name1 = "Kotlin"
    val name2 = "Kotlin"
    val trueValue : Boolean = true
    val falseValue : Boolean = false

    if (name1 == name2){
        println(trueValue)
    } else{
        println(falseValue)
    }

    println()

    val max = if (a > b) {
        a
    } else {
        b
    }

    println(max)
}