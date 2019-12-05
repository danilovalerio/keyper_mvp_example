package projetos.danilo.keypermvpexample.ui.frutas

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_frutas.*
import projetos.danilo.keypermvpexample.R

class FrutasActivity : AppCompatActivity(), FrutasContrato.View {

    private lateinit var presenter: FrutasPresenter
    //adapter que contém uma lista de strings
    private lateinit var adapter: ArrayAdapter<String>
    private lateinit var lista: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frutas)

        //iniciar presenter
        presenter = FrutasPresenter(this)

        lista = lista_frutas

        //carregar frutas
        presenter.getFrutas()

    }

    override fun mostraDados(frutas: Array<String>) {
        adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            frutas
        )

        lista.adapter = adapter

    }
}
