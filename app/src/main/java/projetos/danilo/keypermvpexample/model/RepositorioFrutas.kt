package projetos.danilo.keypermvpexample.model

class RepositorioFrutas {

    private val frutas = arrayOf(
        "Banana",
        "Manga",
        "Pêra",
        "Pêssego",
        "Uva",
        "Laranja"
    )

    fun getFrutas(): Array<String>{
        return frutas
    }
}