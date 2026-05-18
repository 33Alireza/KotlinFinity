package beyond.sessionEight

fun main() {

    val publicParentClass = PublicParentClass()
    println(publicParentClass.name)
    publicParentClass.showName()

    val publicChildClass = PublicParentClass.PublicChildClass()
    publicChildClass.showName()


    val privateParentClass = PrivateParentClass()

    /*println(privateParentClass.name)
    privateParentClass.showName()*/


    val protectedParentClass = ProtectedParentClass()
    /*println(protectedParentClass.name)
    println(protectedParentClass.showName())*/


    val internalParentClass = InternalParentClass()
    println(internalParentClass.name)
    internalParentClass.showName()

    val internalChildClass = InternalParentClass.InternalChildClass()
    println(internalChildClass.name)

}

open class PublicParentClass {

    val name = "Kotlin"

    fun showName() {
        println(name)
    }

    class PublicChildClass : PublicParentClass() {

        fun showNameChild() {
            println(name)
        }

    }

}

open class PrivateParentClass {

    private val name = "Android"

    private fun showName() {
        println(name)
    }

    class PrivateChildClass : PrivateParentClass() {

        fun showNameChild() {
//            println(name)
        }

    }

}

open class ProtectedParentClass {

    protected val name = "Jetpack Compose"

    protected fun showName() {
        println(name)
    }

    class ProtectedChildClass : ProtectedParentClass() {

        fun showNameChild() {
            println(name)
        }

    }

}

open class InternalParentClass {

    internal val name = "Jetpack Compose"

    internal fun showName() {
        println(name)
    }

    class InternalChildClass : InternalParentClass() {

        fun showNameChild() {
            println(name)
        }

    }

}