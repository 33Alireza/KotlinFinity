package beyond.sessionTen

fun main() {

    polyFun()

    polyFun("Android", 3)

    polyFun(3, 4)

    polyFun(6, 2, 8)

}

fun polyFun() {
    println("Beyond 🌌")
}

fun polyFun(name: String, number: Int) {
    println("$name -> $number")
}

fun polyFun(numberOne: Int, numberTwo: Int) {
    println("$numberOne + $numberTwo = ${numberOne * numberTwo}")
}

fun polyFun(numberOne: Int, numberTwo: Int, numberThree: Int) {
    println((numberOne + numberTwo + numberThree) / 3)
}