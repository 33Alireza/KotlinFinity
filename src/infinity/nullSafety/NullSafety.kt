package infinity.nullSafety

fun main() {

    val neverNull: String = "This can't be null"
    var nullable: String? = "You can keep a null here"

    nullable = null

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull))

    println()

    val nullString: String? = null
    println(describeString(nullString))

    println()

    println(lengthString(nullString))

    println()

    println(nullString?.length ?: 0)

    println()

    println("Please enter number :")
    val inputAsInteger = readln().toIntOrNull()?.rem(2)
    println(inputAsInteger)

}

fun describeString(maybeString: String?): String {
    return if (!maybeString.isNullOrEmpty()) {
        "String of length ${maybeString.length}"
    } else {
        "Empty or null string"
    }
}

fun lengthString(maybeString: String?): Int? = maybeString?.length