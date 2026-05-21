package beyond.sessionEleven

fun main() {

    val userInfo = UserInfo("Kotlin", 8, 6)
    println("${userInfo.a} -> ${userInfo.b} -> ${userInfo.c}")

    userInfo.showItems(10, 20, 30, 40, 50, 60, 70, 80, 90)

    println()

    userInfo.showItems("Kotlin", "JetBrains", "Android", "Google", "IntelliJ", "Ktor", "Jetpack Compose", "GitHub")

}

class UserInfo<T, M>(val a: T, val b: M, val c: M) {

    fun <N> showItems(vararg items: N) {
        items.forEach { i -> print("$i - ") }
    }

}