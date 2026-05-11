package infinity.collections.set

fun main() {

    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    println(readOnlyFruit)
    println("This set has ${readOnlyFruit.count()} items")
    println("banana" in readOnlyFruit)

    println()

    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    fruit.remove("cherry")
    fruit.add("dragonFruit")
    println(fruit)

}