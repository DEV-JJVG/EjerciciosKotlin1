fun main() {
    val numero = 84
    val factoresPrimos = descomponerEnFactoresPrimos(numero)
    println("Los factores primos de $numero son: $factoresPrimos")
}

fun descomponerEnFactoresPrimos(numero: Int): MutableList<Int> {
    var n = numero
    val factores = mutableListOf<Int>()
    var divisor = 2

    while (n > 1) {
        while (n % divisor == 0) {
            factores.add(divisor) 
            n /= divisor          
        }
        divisor++
    }

    return factores
}