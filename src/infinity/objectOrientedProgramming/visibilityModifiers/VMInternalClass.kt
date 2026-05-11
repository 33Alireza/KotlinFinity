package infinity.objectOrientedProgramming.visibilityModifiers

open class VMInternalClass {

    internal var name = "Android"

    internal fun showName() {
        println(name)
    }

    class internalChild() : VMInternalClass(){

        fun showName2(){
            println(name)
        }

    }
}