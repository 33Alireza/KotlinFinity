package beyond.sessionFourteen

fun main() {
    println("Please enter you wealth :")
    var wealth = readln().toDouble()
    while (true) {
        println(
            """
                Please select an action :
                d -> deposit
                w -> withdraw
                q -> quit
            """.trimIndent()
        )
        val operation = readln()[0]
        if (operation == 'd') {
            println("Please enter how much you want to deposit :")
            val deposit = readln().toDouble()
            wealth += deposit
            println(wealth)
        } else if (operation == 'w') {
            println("Please enter how much you want to withdraw :")
            val withdraw = readln().toDouble()
            if (withdraw < wealth) {
                wealth -= withdraw
                println(wealth)
            } else {
                println("you don't have enough money")
            }
        } else if (operation == 'q') {
            break
        }
    }
}