package infinity.objectOrientedProgramming.visibilityModifiers

open class VMPublicClass {

    public var name = "JetBrains"

    fun showName(){
        println(name)
    }

    class childPublic : VMPublicClass(){

        fun showName2(){
            println(name)
        }

    }
}