package infinity.advancedKotlinFeatures.operatorOverloading

class Score {

    private var myScore = 8

    infix operator fun plus(number: Int) {
        println("Plus is operator overloading ${myScore + number}")
    }

    infix operator fun div(number: Int) {
        println("Div is operator overloading ${myScore / number}")
    }

    infix operator fun minus(number: Int) {
        println("Minus is operator overloading ${myScore - number}")
    }

    infix operator fun times(number: Int) {
        println("Times is operator overloading ${myScore * number}")
    }

}