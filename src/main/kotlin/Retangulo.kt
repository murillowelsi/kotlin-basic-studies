class Retangulo(val altura: Int, val largura: Int) {
    val isQuadrado
        get() = altura == largura
}

fun main() {
    val retangulo: Retangulo = Retangulo(10, 12)

    if (retangulo.isQuadrado) {
        println("É um quadrado")
    } else {
        print("Não é quadrado")
    }
}