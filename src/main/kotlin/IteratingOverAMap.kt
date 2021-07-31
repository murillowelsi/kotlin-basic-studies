import java.util.*

interface IPerson {
    val name: String
    val age: Int
}

class interfaceImplementation : IPerson {
    override val name: String = "Murillo"
    override val age: Int = 32
}

fun main() {
    val binaryRepresentation = TreeMap<Char, String>()
    val obj = interfaceImplementation()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.code)
        binaryRepresentation[c] = binary
    }

    for ((letter, binary) in binaryRepresentation) {
        println("$letter - $binary")
    }
}