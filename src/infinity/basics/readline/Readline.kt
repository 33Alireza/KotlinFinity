package infinity.basics.readline

fun main(){

    println("Please enter a text :")
    val inputAsString = readln()
    println("your text is : $inputAsString")

    println("Please enter a number :")
    val inputAsInteger = readln().toInt()
    println("your number is : $inputAsInteger")

}