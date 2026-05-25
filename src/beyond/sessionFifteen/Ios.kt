package beyond.sessionFifteen

class Ios : OperatingSystem() {

    override val operatingSystemId = 1
    override val operatingSystemName = "iOS"
    private val operatingSystemDistributor = "Apple"

    override fun showInfo() {
        println("$operatingSystemId -> $operatingSystemName -> $operatingSystemDistributor")
    }

}