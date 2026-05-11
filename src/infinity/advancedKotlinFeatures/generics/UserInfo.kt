package infinity.advancedKotlinFeatures.generics

class UserInfo<T, M>(val a: T, val b: M, val c: M) {

    fun <N> showItems(vararg items: N) {
        items.forEach { i -> print("$i - ") }
    }
}