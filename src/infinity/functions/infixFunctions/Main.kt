package infinity.functions.infixFunctions

fun main() {

    val user = InfixUser()
    user.setValues("Kotlin", "JetBrains")
    user.getValues()

}

fun InfixUser.setValues(_lang: String, _company: String) {
    lang = _lang
    company = _company
}

fun InfixUser.getValues() {
    println("$lang $company")
}