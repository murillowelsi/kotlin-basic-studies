fun main() {
    val numbers1 = arrayListOf("one", "two", "three", "four")

    numbers1.forEach {
        println(it)
    }

    println(numbers1.first())

    val numbers2 = setOf(1, 2, 3, 4)

    println(numbers2.maxOrNull())
    println(numbers2.first())
}