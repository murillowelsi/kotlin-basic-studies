fun main() {
    println(isLetter('a'))
    println(isNotDigit('9'))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'8'