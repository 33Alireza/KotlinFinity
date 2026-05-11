package infinity.collections.array

fun main() {

    val a = arrayOf(1, 8, 9, 56, 75, 9543, "Kotlin", true, 9.548, 94.55f, "JetBrains")
    val b = arrayOf<Int>(4, 84, 65)
    println(a[3])

    for (i in b) {
        println(i)
    }

    println()

    val c = arrayOf(
        arrayOf(54, 6, 95, 7),
        arrayOf(56, 11),
        arrayOf(66, 32, 14)
    )

    for (j in c) {
        for (l in j) {
            print("$l ")
        }
        println()
    }

    println()

    arrayOfMinusOnes(2)

}

fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}