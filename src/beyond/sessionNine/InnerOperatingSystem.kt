package beyond.sessionNine

class InnerOperatingSystem {

    val name = "Beyond"

    fun showName() {
        println(name)
    }

    inner class InnerAndroid {

        private val name = "Android"

        fun showName() {
            println(name)
        }

    }

    inner class InnerIos {

        private val name = "iOS"

        fun showName() {
            println(name)
        }

    }

}