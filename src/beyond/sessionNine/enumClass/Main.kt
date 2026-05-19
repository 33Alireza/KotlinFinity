package beyond.sessionNine.enumClass

fun main() {

    println(DaysEnumClass.TUESDAY)

    for (day in DaysEnumClass.entries) {
        println("${day.ordinal} -> ${day.name}")
    }

    println(LanguagesEnumClass.KOTLIN)

    val profile = Profile(LanguagesEnumClass.JAVASCRIPT)
    profile.showProfile()

    for (language in LanguagesEnumClass.entries) {
        println("${language.ordinal} -> ${language.name}")
    }

}