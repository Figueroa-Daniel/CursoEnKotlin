package com.example.aprendiendokotlin

import android.os.Bundle
import android.security.identity.PersonalizationData
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log
import RetoCursoBot.App
import RetoCursoBot.Persona

val TAG = ":::TAG"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val app = App()
        val persona = Persona(
            name = "Ana López",
            age = 28,
            hobbies = arrayListOf("Leer", "Correr", "Viajar", "Programar")
        )
        val persona2 = Persona(
            name = "Ana López",
            age = 28,
            hobbies = arrayListOf("Leer", "Correr", "Viajar", "Programar")
        )
        app.botDeSeguridad(persona,persona2)





    }
    private fun variablesYConstantes(){
        var name = "Rodrigo"
        Log.d(TAG, "Hola"+name)
        Log.d(TAG, "Hola")
        // val para constantes var para valirables
    }
    private fun tiposDatos(){
        var miString:String = "My String"
        var numberint: Int = 10
        var numberFloat: Float
        var numberDouble: Double
        var character1: Char
        var boolean = false
        var boolean2: Boolean
        Log.d(TAG, "Hola")
        //Log.d(TAG,numerberint)
        //hay que pasarlo a string
        Log.d(TAG,numberint.toString())
        
    }
    private fun operadores(){
        val firstValue=5
        val secondValue=2
        val suma  = firstValue + secondValue;
        Log.d(TAG,suma.toString())
        var resta = firstValue - secondValue
        var mult = firstValue * secondValue
        var div = firstValue/ secondValue
        var resto = firstValue% secondValue
        Log.d(TAG, div.toString())
        // ---------------------------------------
        var igualdad = firstValue==secondValue
        var desigualdad = firstValue != secondValue
        var mayorQue = firstValue>secondValue
        var menorQue = firstValue<secondValue
        // tambien tenemos >=,<=,
        val conjuncion =mayorQue && menorQue
        val disyuncion = mayorQue || menorQue

    }
    private fun nullSafety() {
        val nullString: String? = null

        if (nullString != null) {
            Log.d(TAG, nullString)
        }

        // Forma correcta de controlar nulos con let y Elvis operator
        nullString?.let {
            Log.d(TAG, it) // 'it' es el valor no nulo
        } ?: run {
            Log.d(TAG, "nullString es nulo") // Aquí puedes poner un mensaje alternativo
        }
    }

    private fun funciones(){
        printNameAge()
        printNameAge()
        conParametros("Danìel",22)
        var edadEntreDos=conRetorno(2)



    }
    private fun printNameAge(){
        Log.d(TAG,"Rodrigo")
        Log.d(TAG,26.toString())
    }
    //Funciones con parametros
    private fun conParametros(name: String, age:Int){
        Log.d(TAG,"My name is $name")
        Log.d(TAG,"Mi edad es $age")
    }
    //no es necesario poner el tipo de retorno
    private fun conRetorno(edad : Int): Int{
        return edad/2;
    }
    //Se puede usar una sola sentencia, retorna el valor
    private fun conRetorno2() = 12*2

    //clases

    private fun clases(){
        var rodrigo = Persona("Manolo")
        rodrigo.presentacion()
    }

    class Persona(var name:String){

        fun presentacion(){
            Log.d(TAG,"My name is Rodrigo"+name)
        }

    }
    //hay otro tipo de clases que es para almacenar datos

    data class PersonData(
            val name:String?,
            val age: Int
            )
    //PersonaData funciona como un tipo de dato

    private fun usandoPersonData(){
        var datosPersona = PersonData("Daniel",22)
        usandoPersonData2(datosPersona)

    }
    private fun usandoPersonData2(datos:PersonData){
        Log.d(TAG,"Hola ${datos.name} tienes ${datos.age} años")
    }
    private fun interfaces(){


    }
    class SegundaPersona(var name:String): PersonInterface{

        fun presentacion(){
            Log.d(TAG,"My name is Rodrigo $name")
        }

        override fun returnAge(birthYear: Int): Int =13*2
        


    }
    interface PersonInterface{
        fun returnAge(birthYear:Int):Int

    }
    private fun condicionalesIf(){
        val firstNumber = 19
        val booleanValue = true
        if(firstNumber > 5)
            Log.d(TAG,"Correcto")
        else
            Log.d(TAG,"Incorrecto")
        if(firstNumber >5){
            Log.d(TAG,"Es mayor a 5")
        }else if(firstNumber == 5){
            Log.d(TAG,"Es igual a 5")
        }else{
            Log.d(TAG,"Es mayor a 5")
        }
        //El if con retorno
        var edad: Int = if (!booleanValue){
            17
        }else{
            26
        }
    }
    private fun condicionalesWhen(){
        // En java se llama switch
        val language = "Kotlin"
        when (language) {
            "Kotiln" -> Log.d(TAG, "Se ha seleccionado Kotlin")
            "java" -> Log.d(TAG, "Se ha seleccionado java")
            else -> Log.d(TAG, "Se ha seleccionado otro lenguaje")
        }
        // Si quisiera poner varias lineas se pondria asi
        when (language) {
            "Kotiln" -> {
                Log.d(TAG, "Se ha seleccionado Kotlin")
            }
            //también se podría poner varios a la vez
            "java","javascript" -> {
                Log.d(TAG, "Se ha seleccionado java o javascript")
            }
            else -> Log.d(TAG, "Se ha seleccionado otro lenguaje")
        }
        //se puede usar con rangos numericamente
        var num = 45
        when(num){
            in 2..50-> Log.d(TAG,"Esta entre el 2 y el 50")
            in 60..76 -> Log.d(TAG,"Está entre el 60 y el 76")
        }
    }
    private fun listados(){
        var list = listOf<String>()
        var list2: List<String> = listOf()

        var arrayList = arrayListOf<String>()

        var myList = listOf<String>("Rodrigo","Raquel")
        var myArrayList = arrayListOf<String>("Rodrigo","Raquel")

        var listItem = myList[0]
        var arrayListItem = myArrayList[1]
        //la principal diferencia es que el list no deja modificarse y el arrayList si
        myArrayList.remove("Rodrigo")
        myArrayList.removeAt(1)
        // .clear borra todo el array
        // .addAll añade al final un listado a otro
        // .sortByDescending
    }
    private fun bucleFor(){
        var myArrayList = arrayListOf<String>("Rodrigo","Raquel")
        for(persona in myArrayList){
            Log.d(TAG,persona)
        }
        for(position in 0..10){
            Log.d(TAG,position.toString())
        }
        //esta forma no se debe usar esa forma para recorrer un array porque no omite el ultimo valor, ya que la primera posicion del array es 0
        for(position in 0 until 5){
            //asi si se recorre un array omitiendo la ultima posicion
        }
        for(position in 10 downTo 3 step 2){
            //10 8 6 4
        }
    }
    private fun bucleWhile(){
        var myNumber = 10
        while (myNumber <= 20){
            myNumber++
        }
    }

    private fun bucleDoWhile(){
        var myNumber = 10
        do{
            myNumber++
        }while (myNumber <=10)
    }

    private fun controlDeErrores(){
        val myArrayList = arrayListOf(1,2,3,4,5,6)
        val myString:String? = null
        try {
            Log.d(TAG,myString!!)
            for(position in 0..myArrayList.size)
                Log.d(TAG,myArrayList[position].toString())
        }catch (exception: IndexOutOfBoundsException){
            exception.printStackTrace()
        }catch (exception: NullPointerException){
            exception.printStackTrace()
        }finally {
            Log.d(TAG,"Final")
        }


    }



}