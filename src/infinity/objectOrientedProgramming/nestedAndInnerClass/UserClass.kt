package infinity.objectOrientedProgramming.nestedAndInnerClass

class UserClass {
    val name = "Kotlin"

    fun showName() {
        println("Name is $name")
    }

    class City {
        private val cityName = "Milano"

        fun showCity() {
            println("City is $cityName")
        }
    }

    class Age {
        private val age = 28

        fun showAge() {
            println("Age is $age")
        }
    }
}