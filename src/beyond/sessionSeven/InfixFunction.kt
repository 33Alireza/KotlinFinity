package beyond.sessionSeven

class InfixFunctionClass {

    var lang: String = ""
    var platform: String = ""

}

fun main() {

    val infixFunctionClass = InfixFunctionClass()
    infixFunctionClass.setValues("Kotlin", "Android")
    infixFunctionClass.getValues()

}

fun InfixFunctionClass.setValues(lang: String, platform: String) {
    this.lang = lang
    this.platform = platform
}

fun InfixFunctionClass.getValues() {
    println("$lang $platform")
}