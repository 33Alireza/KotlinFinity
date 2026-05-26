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

        if (inputValue.lowercase() == "e") {
            println("May the force be with you ✨")
            break
        }

        when (inputValue.lowercase()) {
            "m" -> {
                println("Please enter the movie's id :")
                val movieId = readln()

                try {
                    val movie = movies.find { it.id == movieId }
                    movie?.let {
                        println("${movie.id} -> ${movie.title} -> ${movie.year}")
                    }
                } catch (_: Exception) {
                    println("Movie not found")
                }
            }

            "l" -> {
                for (movie in movies) {
                    println("${movie.id} -> ${movie.title} -> ${movie.year}")
                }
            }

            "a" -> {
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
                    println("Movie Added")
                } catch (_: Exception) {
                    println("Unknown Error")
                }
            }

            "r" -> {
                println("Please enter the movie's id :")
                val movieId = readln()
                try {
                    movies.removeIf { it.id == movieId }
                    println("Movie Removed")
                } catch (_: Exception) {
                    println("Unknown Error")
                }
            }
        }
    }

}