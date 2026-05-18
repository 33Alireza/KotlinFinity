package beyond.sessionEight

fun main() {

    val androidClass = AndroidClass(0, "Android")
    androidClass.setLanguage("Kotlin")
    androidClass.showOperatingSystemInfo()
    println(androidClass.androidProgrammingLanguage)

    val iosClass = IosClass(1, "IOS")
    iosClass.showOperatingSystemInfo()

}

open class OperatingSystem(val operatingSystemId: Int) {

    open val operatingSystemLanguage: String? = null
    open val operatingSystemDistributor: String? = null

    open fun showOperatingSystemInfo() {

        println(operatingSystemId)

    }

}

class AndroidClass(androidId: Int, val androidFullName: String) : OperatingSystem(androidId) {

    var androidProgrammingLanguage = ""

    fun setLanguage(androidProgrammingLanguage: String) {
        this.androidProgrammingLanguage = androidProgrammingLanguage
    }

    override val operatingSystemLanguage = androidProgrammingLanguage

    override fun showOperatingSystemInfo() {
        println("$operatingSystemId -> $androidFullName")
    }

}

class IosClass(iosId: Int, val iosFullName: String) : OperatingSystem(iosId) {

    override val operatingSystemLanguage = "Swift"
    override val operatingSystemDistributor = "Apple"

    override fun showOperatingSystemInfo() {
        println("$operatingSystemId -> $iosFullName -> $operatingSystemLanguage")
    }

}