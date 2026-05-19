package beyond.sessionNine.enumClass

class Profile(private val lang: LanguagesEnumClass) {

    fun showProfile() {
        when (lang.langId) {
            0 -> println("Jetpack Compose")
            1 -> println("SwiftUi")
            2 -> println("XML")
            3 -> println("React Native")
            4 -> println("Flutter")
        }
    }

}