package infinity.objectOrientedProgramming.constructor

class ConstructorUser(id: Int) {

    private val name = "$id => Kotlin"

    init {
        when (id) {
            1 -> {
                println("$name JetBrains")
            }
            2 -> {
                println("$name Google")
            }
            3 -> {
                println("$name Android")
            }
        }
    }

    constructor(name: String, family: String, id: Int) : this(id) {
        println("$name $family $id")
    }

    constructor(gitHubId:String, id:Int) : this(id){
        println(gitHubId)
    }
}