package infinity.collections.list

fun main(){

    val readOnlyShapes = listOf("triangle", "square", "circle", "circle")
    println(readOnlyShapes)
    println("The first item in the list is: ${readOnlyShapes.first()}")
    println("This list has ${readOnlyShapes.count()} items")

    println()

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    shapes.remove("triangle")
    shapes.add("pentagon")
    println(shapes)

}