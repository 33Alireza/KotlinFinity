package beyond.sessionEleven

fun main() {

    println("Main started")

    Beyond.showInfo()

    println("Main ended")

}

object Beyond {

    const val NAME = "Android"
    const val LANG = "Kotlin"

    fun showInfo() {
        println("Object started")
        println("$NAME $LANG")
        println("Object ended")
    }

}