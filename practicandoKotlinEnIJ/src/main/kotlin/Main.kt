package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(expresionLamda().toString())
    // Recoger una funcion lamda, la funcion retornara una funcion lamda
    // que hara una operacion matematica segun el parametro que le pasemos
    var funcionRecogida = retornandoFuncionLamda("suma")
    println(funcionRecogida(4,5))

}
fun expresionLamda(): List<String>{
    var listaPersonas = listOf<String>("manolo","fernando","maria")
    // Expresion Lamda, convertir la lista de personas a mayusculas
    var segundaLista = { lista: List<String> ->
        lista.map { it.uppercase() }
    }(listaPersonas)
    return segundaLista
}
// Funcion que retorna una funcion lamda
// cuaando le pasemos el nombre de la operacion, retornara la funcion lamda
fun retornandoFuncionLamda(operation: String): (Int,Int)->Int{
    operation.lowercase()
    return when(operation){
        "suma" -> {a: Int, b: Int -> a + b}
        "resta" -> {a: Int, b: Int -> a - b}
        "multiplicacion" -> {a: Int, b: Int -> a * b}
        "division" -> {a: Int, b: Int -> a / b}
        else -> {_,_ -> 0}
        }

}
fun usandoLamda1(){
    // Funcion Lamda
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    // El map de una lista, aplica la funcion lamda a cada elemento de la lista
    // y retorna una nueva lista con los resultados
    val urls = actions.map { action -> "$prefix/$id/$action" }
    println(urls)
}
fun practicandoListas(text:Int): String {
    val actions = listOf("title", "year", "author")
    val result =actions.get(text)
    val prefix = "https://example.com/book-info"
    val id = 5
    return "$prefix/$id/$result"

}
//pagina 94