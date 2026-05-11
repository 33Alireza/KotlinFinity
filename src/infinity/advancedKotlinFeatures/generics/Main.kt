package infinity.advancedKotlinFeatures.generics

fun main() {

    val info = Info<String>("Kotlin", "JetBrains")
    println("${info.a} -> ${info.b}")

    println()

    val sumNumbers = Info<Int>(5, 6)
    println(sumNumbers.a + sumNumbers.b)

    println()

    val userInfo = UserInfo<String, Int>("Kotlin", 28, 2024)
    println("${userInfo.a} . ${userInfo.b} . ${userInfo.c}")

    println()

    userInfo.showItems<Int>(10, 20, 30, 48, 67, 99, 101)

    println()

    userInfo.showItems<String>("Kotlin","JetBrains","Android","Google","IntelliJ","Ktor","Jetpack Compose","GitHub")

}