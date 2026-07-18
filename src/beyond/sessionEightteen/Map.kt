package beyond.sessionEightteen

fun main() {
    val fruitsImmutableMap = mapOf(
        0 to "Apple", 1 to "Banana", 2 to "Pear"
    )

    for (fruit in fruitsImmutableMap) {
        println("${fruit.key} -> ${fruit.value}")
    }

    val fruitsMutableMap = mutableMapOf(
        0 to "Apple", 1 to "Banana", 2 to "Pineapple"
    )
    fruitsMutableMap[3] = "Strawberry"

    for (fruit in fruitsMutableMap) {
        println("${fruit.key} -> ${fruit.value}")
    }

    val nestedMap = mapOf(
        0 to mapOf(
            "Android" to "Kotlin",
            "iOS" to "Swift",
            "Web" to "JavaScript",
        ), 1 to mapOf(
            "Windows" to "C#",
            "System" to "Rust",
        )
    )

    for (primaryMap in nestedMap) {
        println("${primaryMap.key} -> ${primaryMap.value}")
    }
}