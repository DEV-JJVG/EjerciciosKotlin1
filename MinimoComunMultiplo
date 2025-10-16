fun main() {
    //Asegurarnos de que ambos numeros son positivos por favor
    val primerNumero: Int = 12
    val segundoNumero: Int = 18
    val resultado = minimoComunMultiplo(primerNumero,segundoNumero)
    println("El mínimo común múltiplo es: $resultado")
} 
fun maximoComunDivisor(primerNumero : Int, segundoNumero: Int): Int{
     var x = primerNumero
    var y = segundoNumero
    while(y != 0){  
        val resto = x % y
        x = y
        y = resto
    }  
    return x
} 
fun minimoComunMultiplo (primerNumero: Int, segundoNumero: Int) : Int{
    if(primerNumero == 0 || segundoNumero == 0){
        return 0
    } else {
        return (primerNumero*segundoNumero) / maximoComunDivisor(primerNumero,segundoNumero)
    }
}
