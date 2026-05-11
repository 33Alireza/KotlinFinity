package infinity.objectOrientedProgramming.abstractClass

class Rectangle : Shape() {

    override var length: Int = 6
    override var width: Int = 5

    override fun calculateArea() {
        println("This rectangle area is ${length * width}")
    }
}