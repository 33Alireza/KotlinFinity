package infinity.objectOrientedProgramming.inheritance

open class AnimalTwo constructor(breed: String, age: Int) {

    open var name: String? = null
    open var color = ""

    open fun showColor() {
        println("Show animal color")
    }

}

class Cat(breed: String, age: Int, family: String) : AnimalTwo(breed, age) {

    override var name: String? = "halle"
    override var color: String = "Brawn"

    override fun showColor() {
        println("$name is $color")
    }
    
}