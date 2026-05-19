package beyond.sessionNine.nestedAndInnerClass

fun main() {

    val nestedOperatingSystemClass = NestedOperatingSystem()
    println(nestedOperatingSystemClass.name)
    nestedOperatingSystemClass.showName()

    val nestedAndroid = NestedOperatingSystem.NestedAndroid()
    nestedAndroid.showName()

    val nestedIos = NestedOperatingSystem.NestedIos()
    nestedIos.showName()

    val innerOperatingSystemClass = InnerOperatingSystem()
    println(innerOperatingSystemClass.name)
    innerOperatingSystemClass.showName()

    innerOperatingSystemClass.InnerAndroid().showName()
    innerOperatingSystemClass.InnerIos().showName()

}