fun main() {
    val nome = "Murillo"

    println("Hello $nome!")
    println("Hello \$nome!") // caso queira que o compilador ignore

    println("O resultado da soma é: ${soma(12, 8)}") // para printar expressoes
}

fun soma(a: Int, b:Int):Int {
    return a + b
}