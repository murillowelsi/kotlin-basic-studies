import java.lang.IllegalArgumentException

// (1 + 2) + 4

interface Expression
class Number(val value: Int) : Expression
class Sum(val left: Expression, val right: Expression) : Expression

fun evaluate(expression: Expression): Int =
    when(expression) {
        is Number -> expression.value
        is Sum -> evaluate(expression.left) + evaluate(expression.right)
        else -> throw IllegalArgumentException("Unhandled exception")
    }

fun main() {
    // ((1 + 2) + 4)
    var result = evaluate(Sum(Sum(Number(1), Number(2)), Number(4)))
    println(result)
}