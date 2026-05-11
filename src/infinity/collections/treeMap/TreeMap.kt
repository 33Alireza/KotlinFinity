package infinity.collections.treeMap

import java.util.*

fun main() {

    val user = TreeMap<Int, String>()

    user[1] = "Kotlin"
    user[2] = "JetBrains"
    user[3] = "Google"
    user[4] = "Android"
    user[5] = "Jetpack Compose"

    println(user[1])

    println()

    for ((key,value) in user){
        println("$key -> $value")
    }

}