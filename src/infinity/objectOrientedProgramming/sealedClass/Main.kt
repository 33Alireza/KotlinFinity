package infinity.objectOrientedProgramming.sealedClass

fun main() {

    val addOperation = Operation.Add(4)
    addOperation.addOperator()

    println()

    val divOperation = Operation.Divide(8)
    divOperation.divOperator()

    println()

    val subOperator = Operation.Subtract(9)
    subOperator.subOperator()

    println()

    val mulOperator = Operation.Multiply(8)
    mulOperator.mulOperator()

}