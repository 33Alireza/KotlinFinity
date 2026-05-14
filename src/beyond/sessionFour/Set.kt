package beyond.sessionFour

fun main() {

    val mutableLanguagesSet = mutableSetOf("Kotlin", "JavaScript", "Dart", "Swift", "Go", "Rust", "Dart")
    for (language in mutableLanguagesSet) print("$language ")

    println()

    val immutableLanguagesSet = mutableSetOf("Python", "Java", "C++", "C#", "PHP", "Python")
    for (language in immutableLanguagesSet) print("$language ")

    println()

    for (language in immutableLanguagesSet) {
        mutableLanguagesSet.add(language)
    }

    for (language in mutableLanguagesSet) print("$language ")
}