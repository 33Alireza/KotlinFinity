package infinity.typeSystem.nullableVsNonNullableTypes

fun main() {

    val name = "Kotlin"

    val nickname: String? = null

    println(nickname?.length)

}