package beyond.sessionTen

fun main() {

    val androidClass = Android()
    androidClass.showOperatingSystemInfo()

    val iosClass = Ios()
    iosClass.showOperatingSystemInfo()

}

abstract class OperatingSystem {

    abstract var operatingSystemName: String
    abstract var operatingSystemProgrammingLanguage: String

    abstract fun showOperatingSystemInfo()

}

class Android : OperatingSystem() {

    override var operatingSystemName = "Android"
    override var operatingSystemProgrammingLanguage = "kotlin"

    override fun showOperatingSystemInfo() {
        println("$operatingSystemName -> $operatingSystemProgrammingLanguage 🤖")
    }

}

class Ios : OperatingSystem() {

    override var operatingSystemName = "iOS"
    override var operatingSystemProgrammingLanguage = "Swift"

    override fun showOperatingSystemInfo() {
        println("$operatingSystemName -> $operatingSystemProgrammingLanguage 🍏")
    }

}