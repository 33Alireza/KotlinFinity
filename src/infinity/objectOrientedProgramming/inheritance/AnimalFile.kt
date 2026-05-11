package infinity.objectOrientedProgramming.inheritance

open class Animal(breed: String) {

    open var name: String? = null
    open var color = ""

    open fun showColor() {
        println("Show animal color")
    }

}

class Dog(private val breed: String, private val age: Int) : Animal(breed) {

    override var name: String? = "Jessi"
    override var color: String = "Black"

    override fun showColor() {
        println("$name is $breed and it's color is $color")
    }

}