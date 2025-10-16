import kotlin.math.*
fun main() {
    val numero = 153
    verificarSumaPotencias(numero)
}

fun verificarSumaPotencias(numero: Int) {
    var n = numero
    var cantidadDigitos = 0

    
    var temp = n
    while (temp > 0) {
        cantidadDigitos++
        temp /= 10
    }

    var suma = 0
    temp = n
    while (temp > 0) {
        val digito = temp % 10
        suma += Math.pow(digito.toDouble(), cantidadDigitos.toDouble()).toInt()
        temp /= 10
    }

    if (suma == numero) {
        println("El número $numero es igual a la suma de sus dígitos elevados a la cantidad de dígitos")
    } else {
        println("El número $numero NO es igual a la suma de sus dígitos elevados a la cantidad de dígitos")
    }
}