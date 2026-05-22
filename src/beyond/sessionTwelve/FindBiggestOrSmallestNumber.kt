package beyond.sessionTwelve

fun main() {

    println("For finding the smallest number please enter - and for the biggest number + : ")

    val operator = readln()

    val findBiggestOrSmallestNumber = FindBiggestOrSmallestNumber()

    println(findBiggestOrSmallestNumber.finder(operator))

}

class FindBiggestOrSmallestNumber {

    fun finder(operator: String): Int {

        println("Please enter 20 number :")

        var result = 0

        if (operator == "+") result = biggestNumberFinder()
        else if (operator == "-") result = smallestNumberFinder()

        return result
    }

    private fun smallestNumberFinder(): Int {

        var initialNumber = nullCheckAndReturn()

        for (i in 1..19) {

            val inputValue = nullCheckAndReturn()

            if (inputValue < initialNumber) {
                initialNumber = inputValue
            }

        }

        return initialNumber

    }

    private fun biggestNumberFinder(): Int {

        var initialNumber = nullCheckAndReturn()

        for (i in 1..19) {

            val inputValue = nullCheckAndReturn()

            if (inputValue > initialNumber) {
                initialNumber = inputValue
            }

        }

        return initialNumber

    }

}

fun nullCheckAndReturn(): Int {

    while (true) {

        val inputValue = readlnOrNull()?.toIntOrNull()

        if (inputValue != null) return inputValue

    }
}