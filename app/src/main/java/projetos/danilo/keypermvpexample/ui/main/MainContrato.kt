package projetos.danilo.keypermvpexample.ui.main


interface MainContrato {
    //para realizar a ligação entre View e Presenter
    interface View{
        fun mostrarMensagem(texto: String)
    }

    interface Presenter{
        //chamado quando clicar no botão login
        fun loginClicado(nome: String, senha:String)

    }

}