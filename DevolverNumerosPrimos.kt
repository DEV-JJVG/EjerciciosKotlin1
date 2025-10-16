fun main() {
    val cantNumerosPrimos = 10
    val numerosPrimos = generarNumerosPrimos(cantNumerosPrimos)
    println("Los primeros $cantNumerosPrimos números primos son: $numerosPrimos")
} 
fun esPrimo(numero: Int) : Boolean {
    if (numero < 2) {
        return false
    }
    var divisor = 2
    while (divisor <= numero / divisor) {
        if (numero % divisor == 0) {
            return false
        }
        divisor++
    }
    return true
} 
fun generarNumerosPrimos(cantNumerosPrimos: Int) : MutableList<Int> {
    var numerosPrimos = mutableListOf<Int>()
    var contadorNumerosPrimos = 0
    var i = 0
    while (numerosPrimos.size < cantNumerosPrimos){
        if(esPrimo(contadorNumerosPrimos)){
        numerosPrimos.add(contadorNumerosPrimos)
    }
        contadorNumerosPrimos++
    } 
    return numerosPrimos
}
