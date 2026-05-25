package beyond.sessionFifteen

class Android : OperatingSystem() {

    override val operatingSystemId = 0
    override val operatingSystemName = "Android"
    override val operatingSystemProgrammingLanguage = "Kotlin"

    override fun showInfo() {
        println("$operatingSystemId -> $operatingSystemName -> $operatingSystemProgrammingLanguage")
    }

}