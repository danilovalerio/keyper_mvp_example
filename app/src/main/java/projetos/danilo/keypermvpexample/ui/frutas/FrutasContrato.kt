package projetos.danilo.keypermvpexample.ui.frutas

interface FrutasContrato {

    interface View {

        fun mostraDados(frutas: Array<String>)

    }

    interface Presenter {

        fun getFrutas()

    }
}