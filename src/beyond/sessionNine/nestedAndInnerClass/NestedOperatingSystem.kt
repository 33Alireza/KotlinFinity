package beyond.sessionNine.nestedAndInnerClass

class NestedOperatingSystem {

    val name = "Beyond"

    fun showName() {
        println(name)
    }

    class NestedAndroid {

        private val name = "Android"

        fun showName() {
            println(name)
        }

    }

    class NestedIos {

        private val name = "iOS"

        fun showName() {
            println(name)
        }

    }

}