fun fizzBuzz(number: Int) =
    when {
        number % 15 == 0 -> "FizzBuzz"
        number % 3 == 0 -> "Fizz"
        number % 5 == 0 -> "Buzz"
        else -> "$number"
    }

fun main() {
    for (number in 1..100) {
        println(fizzBuzz(number))
    }
}