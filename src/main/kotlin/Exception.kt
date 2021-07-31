import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main() {
    return try {
        println(percentage(500))
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }


    val idade = lerIdade()
    println(idade)
}

fun percentage(number: Int): String {
    return if (number in 1..100) {
        "$number%"
    } else {
        throw IllegalArgumentException("Invalid Argument: $number should be between 1 and 100")
    }
}

fun lerIdade(): Int? {
    val reader = FileReader(File("src/main/resources/idades.txt"))
    val buffer = BufferedReader(reader)

    return try {
        val num = buffer.readLine()
        Integer.parseInt(num)
    } catch (e: NumberFormatException) {
        null
    } finally {
        buffer.close()
    }
}