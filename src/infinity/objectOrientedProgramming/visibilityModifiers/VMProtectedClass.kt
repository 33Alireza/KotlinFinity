package infinity.objectOrientedProgramming.visibilityModifiers

open class VMProtectedClass {

    protected var name = "IntelliJ"

    protected fun showName() {
        println(name)
    }

    class protectedChild() : VMProtectedClass(){

        fun showName2(){
            println(name)
        }

    }
}