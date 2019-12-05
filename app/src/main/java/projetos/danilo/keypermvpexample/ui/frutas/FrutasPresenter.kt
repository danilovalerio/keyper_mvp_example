package projetos.danilo.keypermvpexample.ui.frutas

import projetos.danilo.keypermvpexample.model.RepositorioFrutas

class FrutasPresenter(private val view: FrutasContrato.View) : FrutasContrato.Presenter{

    private val repositorioFrutas = RepositorioFrutas()

    override fun getFrutas() {

        val frutas = repositorioFrutas.getFrutas()
        //pega o método de visualização e passa frutas
        view.mostraDados(frutas)

    }
}