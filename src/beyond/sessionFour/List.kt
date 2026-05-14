package beyond.sessionFour

fun main() {

    val mutableFruitsList = mutableListOf("Banana", "Apple", "Mongo", "Coconut", "Banana")

    for (fruit in mutableFruitsList) {
        print("$fruit ")
    }

    println()

    mutableFruitsList.add("Pineapple")
    mutableFruitsList.remove("Coconut")

    for (fruit in mutableFruitsList) {
        print("$fruit ")
    }

    println()

    val immutableFruitsList = listOf("Banana", "Apple", "Mongo", "Coconut", "Banana")

    for (fruit in immutableFruitsList) {
        print("$fruit ")
    }
    println()

    println(immutableFruitsList.count())
    println(immutableFruitsList[immutableFruitsList.lastIndex])
    println(immutableFruitsList.first())
}