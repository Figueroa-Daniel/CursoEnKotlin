package RetoCursoBot
import android.util.Log

class App {
    var TAG: String = ":::TAG"

    public fun botDeSeguridad(persona: Persona, personaAccess: Persona){
        if (persona.name == personaAccess.name && persona.age == personaAccess.age){
            Log.d(TAG, "Acceso concedido")
        }else{
            Log.d(TAG, "Acceso denegado")
            return
        }
        if (persona.age <18){
            Log.d(TAG, "usted es menor de edad, no puede acceder")
            return
        } else if(persona.age > 65 && persona.age <100){
            Log.d(TAG, "usted es demasiado mayor, no puede acceder")
            return
        }else{
            Log.d(TAG, "exito")
        }
        for (hobby in persona.hobbies){
            Log.d(TAG,hobby)
        }
    }
}