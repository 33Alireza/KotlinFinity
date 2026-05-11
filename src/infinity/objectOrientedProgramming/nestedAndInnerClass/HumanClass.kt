package infinity.objectOrientedProgramming.nestedAndInnerClass

class HumanClass {
    val name = "JetBrains"

    fun showName() {
        println("Name is $name")
    }

    inner class City {
        private val cityName = "London"

        fun showCity() {
            println("$name City is $cityName")
        }
    }

    inner class Age {
        private val age = 33

        fun showAge() {
            println("$name Age is $age")
        }
    }
}