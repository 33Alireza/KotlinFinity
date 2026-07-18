package beyond.sessionEightteen

fun main() {
    val fruitsImmutableList = listOf("Apple", "Banana", "Pear", "Grape", "Pineapple", "Strawberry", "Coconut")
    println(fruitsImmutableList)

    for (fruit in fruitsImmutableList) {
        println(fruit)
    }

    val fruitsMutableList = mutableListOf("Apple", "Banana", "Pear")
    fruitsMutableList.add("Pineapple")
    fruitsMutableList.remove("Pear")

    for (fruit in fruitsMutableList) {
        println(fruit)
    }

    val nestedProgrammingLanguagesList = listOf(
        listOf(
            "Kotlin",
            "Java",
            "Swift",
        ), listOf(
            "JavaScript",
            "TypeScript",
            "Rust",
            "Python",
        ), listOf(
            "C", "C++", "C#"
        )
    )

    for (primaryList in nestedProgrammingLanguagesList) {
        for (language in primaryList) {
            println(language)
        }
    }
}