package beyond.sessionTwentyOne

open class OperatingSystem {
    open val id: Int? = null
    open val name: String? = null
    open val language: String? = null

    open fun showInfo() {
        println("$id -> $name -> $language")
    }
}

class Android : OperatingSystem() {
    override val id = 1
    override val name = "Android"
    override val language = "Kotlin"

    override fun showInfo() {
        println("$name -> $language")
    }
}

class Ios : OperatingSystem() {
    override val id = 2
    override val name = "iOS"
    val distributor = "Apple"

    override fun showInfo() {
        println("$name -> $distributor")
    }
}

fun main() {
    val android = Android()
    android.showInfo()
    println("${android.id} -> ${android.name}")

    val ios = Ios()
    ios.showInfo()
}