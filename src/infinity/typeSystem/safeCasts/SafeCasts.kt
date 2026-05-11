package infinity.typeSystem.safeCasts

fun main(){
    val value: Any = 123
    val text: String? = value as? String
    println(text)
}