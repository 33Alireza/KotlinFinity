package infinity.objectOrientedProgramming.enumClass

class Profile(private val users: Users) {

    fun showUserFamily() {
        if (users.userId == 1) {
            println("Kotlin")
        }
    }

}