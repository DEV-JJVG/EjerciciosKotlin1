fun main(){
    var numero: Int = 8
    esPrimo(numero)
}
fun esPrimo(numero: Int) {
    if (numero < 2) {
        println("El número $numero no es primo")
        return
    }

    var divisor = 2
    while (divisor <= numero / divisor) {
        if (numero % divisor == 0) {
            println("El número $numero no es primo")
            return 
        }
        divisor++
    }

    println("El número $numero es primo")
} 
