package beyond.sessionTen

fun main() {

    val android = OperatingSystemDataClass(
        "Android",
        "Kotlin",
        "Google"
    )

    val ios = OperatingSystemDataClass(
        "iOS",
        "Swift",
        "Apple"
    )

    println("${android.name} -> ${android.programmingLanguage} -> ${android.distributor}")
    println("${ios.name} -> ${ios.programmingLanguage} -> ${ios.distributor}")

}

data class OperatingSystemDataClass(
    val name: String,
    val programmingLanguage: String,
    val distributor: String,
)