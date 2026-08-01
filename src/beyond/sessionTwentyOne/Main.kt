package beyond.sessionTwentyOne

abstract class OperatingSystem {
    abstract val id: Int?
    abstract val name: String?
    abstract val language: String?

    abstract fun showInfo()
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
    override val language = "Swift"
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