package RetoCurso

class Programador(var name: String, val age: Int, var lenguaje: String) : ProgramadorInterface {
    override fun getProgrammerData(): ProgrammerData {
        return ProgrammerData(name, age, lenguaje)
    }
}
