package beyond.sessionTwentyOne

interface OperatingSystem {
    val id: Int?
    val name: String?
    val language: String?

    fun showInfo()
}

interface ExtendedOperatingSystem {
    val distributor: String?
}

class Android : OperatingSystem, ExtendedOperatingSystem {
    override val id = 1
    override val name = "Android"
    override val language = "Kotlin"
    override val distributor = "Google"

    override fun showInfo() {
        println("$name -> $language")
    }
}

class Ios : OperatingSystem, ExtendedOperatingSystem {
    override val id = 2
    override val name = "iOS"
    override val language = "Swift"
    override val distributor = "Apple"

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