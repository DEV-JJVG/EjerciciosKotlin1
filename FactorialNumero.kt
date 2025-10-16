fun main() {
    val numeroFactorial: Int = 5
    val resultado = numeroFactorial(numeroFactorial)
    println("El factorial de $numeroFactorial es $resultado")
}
fun numeroFactorial(numeroFactorial: Int ) : Int {
        var factorial: Int  = 1
    for (i in numeroFactorial downTo 1) {
        factorial *= i
    }
    val resultado = factorial
    return resultado
} 
    