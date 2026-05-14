package beyond.sessionFour

fun main() {

    val mutableLaptopsMap = mutableMapOf(
        "Apple" to "Macbook",
        "Asus" to "Rog Strix",
        "Microsoft" to "Surface",
        "Lenovo" to "Legion",
    )

    for (laptop in mutableLaptopsMap) {
        println("${laptop.key} -> ${laptop.value}")
    }

    println()

    mutableLaptopsMap["MSI"] = "Raider"
    mutableLaptopsMap["HP"] = "Victus"
    mutableLaptopsMap.remove("Lenovo")

    for (laptop in mutableLaptopsMap) {
        println("${laptop.key} -> ${laptop.value}")
    }

    println()

    val immutablePhonesMap = mutableMapOf(
        "Apple" to "iPhone",
        "Google" to "Pixel",
        "Samsung" to "Galaxy",
    )

    for (phone in immutablePhonesMap) {
        println("${phone.key} -> ${phone.value}")
    }

    println()

    val languagesMap = mutableMapOf<Int, String>(
        1 to "Kotlin",
        2 to "JavaScript",
        3 to "Swift",
        4 to "Java",
        5 to "Dart"
    )

    for (language in languagesMap) println("${language.key} -> ${language.value}")

    println()

    val languagesNestedMap = mutableMapOf<Int, MutableMap<String, String>>(
        1 to mutableMapOf("Android" to "Kotlin"),
        2 to mutableMapOf("iOS" to "Swift"),
        3 to mutableMapOf("Web" to "JavaScript")
    )

    for (languageIndices in languagesNestedMap) {
        for (language in languageIndices.value) {
            println("${languageIndices.key} -> ${language.key} = ${language.value}")
        }
    }
}