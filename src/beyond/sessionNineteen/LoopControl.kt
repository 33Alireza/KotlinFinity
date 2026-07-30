package beyond.sessionNineteen

fun main() {
    for (i in 1..10) {
        if (i == 5) break
        println(i)
    }

    for (i in 10 downTo 1) {
        if (i == 5) continue
        println(i)
    }

    firstLoop@ for (i in 1..5) {
        secondLoop@ for (j in 1..i) {
            print(j)
            if (i == 4) break@firstLoop
            if (j == 2) continue@secondLoop
        }
        println()
    }
}