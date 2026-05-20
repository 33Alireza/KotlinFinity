package beyond.sessionTen

fun main() {

    val androidClass = AndroidClass()
    androidClass.showOperatingSystemInfo()

    val iosClass = IosClass()
    iosClass.showOperatingSystemInfo()

}

interface OperatingSystemInterface {

    val operatingSystemName: String
    val operatingSystemProgramingLanguage: String

    fun showOperatingSystemInfo()

}

interface ExtendedOperatingSystemInterface {

    val operatingSystemDistributor: String

}

class AndroidClass : OperatingSystemInterface, ExtendedOperatingSystemInterface {

    override val operatingSystemName = "Android"
    override val operatingSystemProgramingLanguage = "Kotlin"

    override fun showOperatingSystemInfo() {
        println("$operatingSystemName -> $operatingSystemProgramingLanguage")
    }

    override val operatingSystemDistributor = "Google"
}

class IosClass : OperatingSystemInterface, ExtendedOperatingSystemInterface {

    override val operatingSystemName = "iOS"
    override val operatingSystemProgramingLanguage = "Swift"

    override fun showOperatingSystemInfo() {
        println("$operatingSystemName -> $operatingSystemProgramingLanguage -> $operatingSystemDistributor")
    }

    override val operatingSystemDistributor = "Apple"
}