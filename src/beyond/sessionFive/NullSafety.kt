package beyond.sessionFive

fun main() {

    val nonNullableString = "nonNullableString"
    var nullableString: String? = "nullableString"


    val nullVariable : String? = null
    println(nullVariable?.length ?: 0)


}