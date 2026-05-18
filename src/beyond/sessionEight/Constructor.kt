package beyond.sessionEight

fun main() {

    val userNumberOne = UserClass(0, "33alireza")
    userNumberOne.showUserInfo()

    val userNumberTwo = UserClass(1, "ifmat")
    userNumberTwo.showUserInfo()

}

class UserClass(val userId: Int, val userName: String) {

    fun showUserInfo() {
        println("$userId -> $userName")
    }

}