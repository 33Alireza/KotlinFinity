package beyond.sessionFifteen

interface OperatingSystemInterface {

    val operatingSystemId: String
    val operatingSystemName: String
    val operatingSystemProgrammingLanguage: String
    val operatingSystemDistributor: String

    fun showInfo()

}