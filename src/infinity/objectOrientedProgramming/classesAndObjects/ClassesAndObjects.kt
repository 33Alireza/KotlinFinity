package infinity.objectOrientedProgramming.classesAndObjects

class Contact(val id: Int, var email: String = "example@gmail.com") {

    fun printId() {
        println("ID: $id")
    }

}

fun main() {

    val contact = Contact(1, "mary@gmail.com")
    println("${contact.id} -> ${contact.email}")

    println()

    contact.email = "jane@gmail.com"
    println(contact.email)

    println()

    contact.printId()

}