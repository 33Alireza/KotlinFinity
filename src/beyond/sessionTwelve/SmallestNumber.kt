package beyond.sessionTwelve

fun main() {

    var initialNumber = nullCheckAndReturn()

    for (i in 1..19) {

        val inputValue = nullCheckAndReturn()

        if (inputValue < initialNumber) {
            initialNumber = inputValue
        }

    }

    println(initialNumber)

}

fun nullCheckAndReturn(): Int {

    while (true) {

        val inputValue = readlnOrNull()?.toIntOrNull()

        if (inputValue != null) return inputValue

    }
}