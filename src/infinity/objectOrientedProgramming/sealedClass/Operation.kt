package infinity.objectOrientedProgramming.sealedClass

sealed class Operation {

    val number = 2

    class Add(private val value: Int) : Operation() {
        fun addOperator() {
            print(value + number)
        }
    }

    class Subtract(private val value: Int) : Operation() {
        fun subOperator() {
            print(value - number)
        }
    }

    class Multiply(private val value: Int) : Operation() {
        fun mulOperator() {
            print(value * number)
        }
    }

    class Divide(private val value: Int) : Operation() {
        fun divOperator() {
            print(value / number)
        }
    }

}
