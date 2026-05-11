package beyond.sessionOne

fun main() {

    // there are two types of variables : Val, Var
    // first type is Var which stands for Variable

    var gitHubId = "33alireza"

    // var is mutable which means you can change its value when you need to

    gitHubId = "https://github.com/33alireza"

    // on the other hand val is immutable which means you can't change its value never again

    val languageName = "Kotlin"

    // the trick is that you always should use val until you realize that you need to change its value, so you can convert val into var
}