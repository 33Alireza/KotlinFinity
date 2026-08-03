package beyond.sessionTwentyThree

sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val message: String) : Result()
    object Loading : Result()
}

fun handleResult(result: Result) {
    when (result) {
        is Result.Success -> println("Success: ${result.data}")
        is Result.Error -> println("Success: ${result.message}")
        is Result.Loading -> println("Loading...")
    }
}

fun main() {
    handleResult(Result.Success("Data loaded"))
    handleResult(Result.Error("Something went wrong"))
    handleResult(Result.Loading)
}