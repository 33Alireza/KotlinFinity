package beyond.sessionSeven

class ExtensionFunctionClass {

    var lang: String = ""
    var platform: String = ""

}

fun main() {

    val extensionFunctionClass = ExtensionFunctionClass()
    extensionFunctionClass.setValues("Kotlin", "Android")
    extensionFunctionClass.getValues()

}

fun ExtensionFunctionClass.setValues(langFun: String, platformFun: String) {
    lang = langFun
    platform = platformFun
}

fun ExtensionFunctionClass.getValues() {
    println("$lang $platform")
}