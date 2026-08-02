package beyond.sessionTwentyTwo

open class PublicParentClass {
    val name = "Kotlin"

    fun parentShowName() {
        println(name)
    }

    class PublicChildClass : PublicParentClass() {
        fun childShowName() {
            println(name)
        }
    }
}

fun main() {
    val publicParentClass = PublicParentClass()
    println(publicParentClass.name)
    publicParentClass.parentShowName()

    val publicChildClass = PublicParentClass.PublicChildClass()
    publicChildClass.childShowName()
}