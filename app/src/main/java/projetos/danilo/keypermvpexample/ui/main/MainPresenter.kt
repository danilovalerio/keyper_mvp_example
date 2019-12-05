package projetos.danilo.keypermvpexample.ui.main

import projetos.danilo.keypermvpexample.model.RepositorioSessao

class MainPresenter(private val view: MainContrato.View) : MainContrato.Presenter {

    private var repositorioSessao: RepositorioSessao = RepositorioSessao()

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
        val loginComSucesso = repositorioSessao.login(nome, senha)

        if(loginComSucesso){
            view.mostrarMensagem("Login efetuado com sucesso!")
            view.iniciaAtividadeFrutas()
        } else {
            view.mostrarMensagem("Falha ao tentar logar!")
        }

    }
}