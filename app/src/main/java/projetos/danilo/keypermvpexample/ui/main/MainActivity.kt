package projetos.danilo.keypermvpexample.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import projetos.danilo.keypermvpexample.R

class MainActivity : AppCompatActivity(), MainContrato.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
