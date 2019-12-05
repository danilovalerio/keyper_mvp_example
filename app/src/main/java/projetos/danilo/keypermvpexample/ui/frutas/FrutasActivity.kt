package projetos.danilo.keypermvpexample.ui.frutas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_frutas.*
import projetos.danilo.keypermvpexample.R

class FrutasActivity : AppCompatActivity(), FrutasContrato.View {

    private lateinit var presenter: FrutasPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frutas)

        //iniciar presenter
        presenter = FrutasPresenter(this)

        val lista = lista_frutas


    }
}
