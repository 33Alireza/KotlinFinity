package beyond.sessionThirteen

class Logic {

    var operatingSystemsList = mutableListOf<OperatingSystem>()

    init {
        getList()
    }

    fun getList() {

        try {

            val result = FakeApi.getOperatingSystemList()
            operatingSystemsList = result


        } catch (e: Exception) {

            println(e.message)

        }

    }

}