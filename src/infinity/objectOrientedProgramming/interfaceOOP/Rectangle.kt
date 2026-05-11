package infinity.objectOrientedProgramming.interfaceOOP

class Rectangle : Shape, ShapeTwo {

    override var length: Int = 6
    override var width: Int = 5

    override fun calculateArea() {
        println("This rectangle area is ${length * width}")
    }

    override var testShapeTwo: String = "Kotlin"

}