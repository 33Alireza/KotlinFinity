package beyond.sessionEight

fun main() {

    val numbersOperation = NumbersOperation()
    numbersOperation.setValues(4, 6)
    println(numbersOperation.sumNumber())

}

class NumbersOperation {

    var numberOne: Int? = null
    var numberTwo: Int? = null

    fun setValues(numberOne: Int, numberTwo: Int) {
        this.numberOne = numberOne
        this.numberTwo = numberTwo
    }

    fun sumNumber(): Int? {
        return if (numberOne != null && numberTwo != null) {
            numberOne!! + numberTwo!!
        } else {
            null
        }
    }

}