package beyond.sessionSeventeen

class CoachClass {
    private val coachesList = mutableListOf<Coach>()

    fun showCoaches() {
        try {
            if (coachesList.isEmpty()) println("No coaches found")
            else for (coach in coachesList) {
                println("${coach.id}: ${coach.name} -> ${coach.speciality}")
            }
        } catch (_: Exception) {
            println("Unknown Error")
        }
    }

    fun addCoach(coach: Coach) {
        try {
            coachesList.add(coach)
            println("Coach Added Successfully")
        } catch (_: Exception) {
            println("Unknown Error")
        }
    }

    fun removeCoach(id: String) {
        try {
            coachesList.removeIf { it.id == id }
            println("Coach Removed Successfully")
        } catch (_: Exception) {
            println("Unknown Error")
        }
    }
}