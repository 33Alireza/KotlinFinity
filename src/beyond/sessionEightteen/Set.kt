package beyond.sessionEightteen

fun main() {
    val fruitsImmutableSet = setOf("Apple", "Banana", "Pear", "Apple")

    for (fruit in fruitsImmutableSet) {
        println(fruit)
    }

    val fruitsMutableSet = mutableSetOf("Apple", "Banana", "Pear", "Apple")
    fruitsMutableSet.add("Pineapple")

    for (fruit in fruitsMutableSet) {
        println(fruit)
    }
}