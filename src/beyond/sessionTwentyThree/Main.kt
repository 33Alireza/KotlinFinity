package beyond.sessionTwentyThree

class Outer {
    private val outerProperty = "I'm from outer"

    class Nested {
        fun show() {
            // println(outerProperty)
            println("I'm from the nested class")
        }
    }

    inner class Inner {
        fun show() {
            println("This is an inner class")
            println(outerProperty)
        }
    }
}

fun main() {
    val nested = Outer.Nested()
    nested.show()

    val outer = Outer()
    val inner = outer.Inner()
    inner.show()
}