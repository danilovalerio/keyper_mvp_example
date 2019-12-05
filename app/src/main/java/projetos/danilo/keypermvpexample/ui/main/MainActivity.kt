package projetos.danilo.keypermvpexample.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import projetos.danilo.keypermvpexample.R

class MainActivity : AppCompatActivity(), MainContrato.View {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inicializa presenter que terá nossa lógica, this é dependência é a view da camada contrato
        presenter = MainPresenter(this)

        val nome = et_username.text.toString()
        val senha = et_password.text.toString()

        btn_login.setOnClickListener{
//            Toast.makeText(this,"Botão pressionado",Toast.LENGTH_SHORT).show()

        }
    }
}
