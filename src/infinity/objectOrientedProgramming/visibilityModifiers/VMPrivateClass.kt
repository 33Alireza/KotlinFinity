package infinity.objectOrientedProgramming.visibilityModifiers

open class VMPrivateClass {

    private var name = "Kotlin"

    private fun showName() {
        println(name)
    }

    class privateChild : VMPrivateClass() {

        fun showName2(){
            //println(name)
        }

    }
}