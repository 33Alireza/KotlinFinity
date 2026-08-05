package beyond.sessionTwentyFour

fun main() {
    println("A man a plan a canal Panama".isPalindrome())
    println("hello".isPalindrome())
}

fun String.isPalindrome(): Boolean {
    val cleaned = this.filter { it.isLetterOrDigit() }.lowercase()
    return cleaned == cleaned.reversed()
}