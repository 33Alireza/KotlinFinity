package beyond.sessionThirteen

fun main() {

    val operatingSystemLogic = Logic()

    if (operatingSystemLogic.uiState == UiState.Success) {

        for (os in operatingSystemLogic.operatingSystemsList) {
            println("${os.name} -> ${os.distributor} -> ${os.category}")
        }

    } else {
        println("Server Error")
    }

}