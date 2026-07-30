package beyond.sessionNineteen

fun main() {
    for (i in 1..10) {
        println(i)
    }

    for (i in 1..<10) {
        println(i)
    }

    for (i in 10 downTo 1) {
        println(i)
    }

    for (i in 1..10 step 2) {
        println(i)
    }

    val cakes = listOf("Carrot", "Cheese", "Chocolate")
    for (cake in cakes) {
        println(cake)
    }
}