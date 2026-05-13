package beyond.sessionThree

fun main() {

    for (f in 0..10) {
        println(f)
        if (f == 5) {
            break
        }
    }

    for (u in 0..10) {
        if (u == 5) {
            continue
        }
        println(u)
    }

    firstLoop@ for (c in 0..5) {
        secondLoop@ for (k in 1..3) {
            if (k == 2) {
                continue@secondLoop
            }
            println("$c ------> $k")
        }
    }

    var infiniteLoopCounter = 0
    while (true) {
        val number = readlnOrNull()?.toInt()
        infiniteLoopCounter++
        if (infiniteLoopCounter == 5) {
            break
        }
    }
}