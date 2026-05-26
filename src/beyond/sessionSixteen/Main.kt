package beyond.sessionSixteen

fun main() {

    val movies = mutableListOf(
        Movie(
            "0",
            "Interstellar",
            "2014"
        ),
        Movie(
            "1",
            "Pulp Fiction",
            "1994"
        ),
        Movie(
            "3",
            "Arrival",
            "2016"
        ),
        Movie(
            "4",
            "Casino",
            "1991"
        ),
        Movie(
            "5",
            "Snatch",
            "2000"
        ),
    )

    while (true) {
        println(
            """
            Movie -> M
            Movies List -> L
            Add Movie -> A
            Remove Movie -> R
            Exit -> E
        """.trimIndent()
        )

        val inputValue = readln()

        when (inputValue) {
            "M" -> {
                println("Please enter a movie id :")
                val movieId = readln()

                try {
                    println(movies.find { it.id == movieId })
                } catch (_: Exception) {
                    println("Movie not found")
                }
            }

            "L" -> {
                for (movie in movies) {
                    println("${movie.id} -> ${movie.title} -> ${movie.year}")
                }
            }

            "A" -> {
                println("Please enter the movie's id :")
                val movieId = readln()
                println("Please enter the movie's title :")
                val movieTitle = readln()
                println("Please enter the movie's year :")
                val movieYear = readln()

                try {
                    movies.add(
                        Movie(
                            movieId,
                            movieTitle,
                            movieYear
                        )
                    )
                } catch (_: Exception) {
                    println("Unknown Error")
                }
            }
        }
    }

}