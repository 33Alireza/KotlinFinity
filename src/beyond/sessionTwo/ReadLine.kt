package beyond.sessionTwo

fun main() {
    // You can make an input using readln, default types is always string

    println("Please enter a text :")
    val inputAsString = readln()
    println("your text is : $inputAsString")

    // You can change the input's type like this ->

    println("Please enter a number :")
    val inputAsInteger = readln().toInt()
    println("your number is : $inputAsInteger")
}