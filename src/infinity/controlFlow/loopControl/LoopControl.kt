package infinity.controlFlow.loopControl

fun main() {

    for (i in 1..5) {
        if (i == 3) {
            break
        }
        println(i)
    }

    println()

    iLoop@ for (i in 1..4) {
        jLoop@ for (j in 1..3) {
            if (j == 2) {
                continue@jLoop
            }
            println("$i --- $j")
        }
    }

}