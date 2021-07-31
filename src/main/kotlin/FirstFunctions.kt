fun main() {
    println(max(12, 13))
    println(max1(25, 13))
}

// corpo de bloco
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// corpo de expressao
fun max1(a: Int, b: Int): Int = if (a > b) a else b