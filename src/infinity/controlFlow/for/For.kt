package infinity.controlFlow.`for`

fun main() {

    for (x in 0..10){
        println(x)
    }

    println()

    for (x in 0..<10){
        println(x)
    }

    println()

    for (x in 0..<10 step 2){
        println(x)
    }

    println()

    for (x in 10 downTo 0 step 2){
        println(x)
    }

    println()

    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
}