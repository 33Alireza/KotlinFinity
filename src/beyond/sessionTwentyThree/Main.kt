package beyond.sessionTwentyThree

object Logger {
    fun log(message: String) {
        println("[LOG] $message]")
    }
}

fun main() {
    Logger.log("App stated")
    Logger.log("User logged in")
}