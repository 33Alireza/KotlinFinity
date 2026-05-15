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
}