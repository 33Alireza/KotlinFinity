package beyond.sessionFourteen

fun main() {

    println("Please enter your number :")
    var result = readln().toDouble()

    while (true) {
        println("Please enter your operator :")
        val op = readln()[0]

        if (op == '=') {
            println("Result = $result")
            break
        }

        println("please enter another number :")
        val num = readln().toDouble()

        result = when (op) {
            '+' -> result + num
            '-' -> result - num
            '*' -> result * num
            '/' -> {
                if (num != 0.0) result / num
                else {
                    println("Error: division by zero is not allowed")
                    result
                }
            }

            else -> {
                println("Error: wrong operator")
                result
            }
        }
    }

}