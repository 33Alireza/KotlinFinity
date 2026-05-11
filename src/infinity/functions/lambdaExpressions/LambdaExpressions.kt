package infinity.functions.lambdaExpressions

fun main() {

    println("hello".uppercase())

    println()

    val upperCaseString = { text: String -> text.uppercase() }
    println(upperCaseString("hello"))

    println()

    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { x -> x < 0 }
    println(positives)
    println(negatives)

    println()

    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { x -> x * 3 }
    println(doubled)
    println(tripled)

}