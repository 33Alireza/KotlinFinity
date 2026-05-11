package infinity.functions.extensionFunctions

fun main() {

    val user = ExtensionUser()
    user.setValues("Kotlin", "JetBrains")
    user.getValues()

}

fun ExtensionUser.setValues(_lang: String, _company: String) {
    lang = _lang
    company = _company
}

fun ExtensionUser.getValues() {
    println("$lang $company")
}