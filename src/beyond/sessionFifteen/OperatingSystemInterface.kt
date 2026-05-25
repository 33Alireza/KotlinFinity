package beyond.sessionFifteen

interface OperatingSystemInterface {

    val operatingSystemId: Int?
    val operatingSystemName: String?
    val operatingSystemProgrammingLanguage: String?

    fun showInfo()

}