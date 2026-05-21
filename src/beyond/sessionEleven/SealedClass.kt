package beyond.sessionEleven

fun main() {

    val addOperator = Operation.Add(4)
    addOperator.addOperator()

    val subOperator = Operation.Subtract(3)
    subOperator.subOperator()

    val mulOperator = Operation.Multiply(6)
    mulOperator.mulOperator()

    val divOperator = Operation.Divide(7)
    divOperator.divOperator()

}

sealed class Operation {

    val number = 8

    class Add(private val value: Int) : Operation() {
        fun addOperator() {
            println(value + number)
        }
    }

    class Subtract(private val value: Int) : Operation() {
        fun subOperator() {
            println(value - number)
        }
    }

    class Multiply(private val value: Int) : Operation() {
        fun mulOperator() {
            println(value * number)
        }
    }

    class Divide(private val value: Int) : Operation() {
        fun divOperator() {
            println(value / number)
        }
    }

}