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

open class ProtectedParentClass {
    protected val name = "Kotlin"

    open fun parentShowName() {
        println(name)
    }

    class ProtectedChildClass : ProtectedParentClass() {
        override fun parentShowName() {
            println(name)
        }
    }
}


fun main() {
    val publicParentClass = PublicParentClass()
    println(publicParentClass.name)
    publicParentClass.parentShowName()

    val publicChildClass = PublicParentClass.PublicChildClass()
    println(publicChildClass.name)
    publicChildClass.childShowName()


    val protectedParentClass = ProtectedParentClass()
    // println(protectedParentClass.name)
    // protectedParentClass.parentShowName()

    val protectedChildClass = ProtectedParentClass.ProtectedChildClass()
    protectedChildClass.parentShowName()
}