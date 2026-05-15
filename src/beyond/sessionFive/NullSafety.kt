package beyond.sessionFive

fun main() {

    val nonNullableString = "nonNullableString"
    var nullableString: String? = "nullableString"

    println(nullableString)


    val nullVariable: String? = null
    println(nullVariable?.length ?: 0)

    nullableString = null
    nullableString?.let {
        println(it.length)
    }

    showStringLength(nonNullableString)
}

fun showStringLength(string: String?): String {
    return if (!string.isNullOrBlank()) {
        "The string length is ${string.length}"
    } else {
        "The String is null"
    }
}