package projetos.danilo.keypermvpexample.ui.frutas

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_frutas.*
import projetos.danilo.keypermvpexample.R

class FrutasActivity : AppCompatActivity(), FrutasContrato.View {

    private lateinit var presenter: FrutasPresenter
    //adapter que contém uma lista de strings
    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frutas)

        //iniciar presenter
        presenter = FrutasPresenter(this)

        adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            arrayOf()
        )
        val lista = lista_frutas
        lista.adapter = adapter

    }
}
