package projetos.danilo.keypermvpexample.ui.main

class MainPresenter(private val view: MainContrato.View) : MainContrato.Presenter {
    override fun loginClicado(nome: String, senha: String) {
        if(nome.isNullOrEmpty()){
            view.mostrarMensagem("Nome inválido!")
            return
        }

        if(senha.isNullOrEmpty()){
            view.mostrarMensagem("Senha inválida!")
            return
        }

        //-----------------
        view.mostrarMensagem("Dados preenchidos")
    }
}