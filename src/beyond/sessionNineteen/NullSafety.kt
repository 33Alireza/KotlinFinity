package beyond.sessionNineteen

fun main() {
    val nonNullType: String = "non-nul type"
    var nullableType: String? = "nullable type"
    nullableType = null

    println(nullableType ?: "Yo!")

    nullableType?.let {
        println(it)
    }
}