class Person (
    val nome: String,
    val idade: Int
)

fun main() {
    val murillo: Person = Person("Murillo", 32)
    println("Pessoa 1: ${murillo.nome} Idade: ${murillo.idade}")

    val pessoa2: Person = Person("Pessoa2", 45)
    println("Pessoa 2: ${pessoa2.nome} Idade: ${pessoa2.idade}")
}