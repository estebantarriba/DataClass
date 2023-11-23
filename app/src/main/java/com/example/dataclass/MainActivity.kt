package com.example.dataclass
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.dataclass.R

data class Formulario( //se crea el data class
    val gamertag: String,
    val edad: Int,
    val videojuegoFavorito: String
)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnProcesar = findViewById<Button>(R.id.btnProcesar)//se declara el boton

        btnProcesar.setOnClickListener { //boton de iniciar
            procesarFormulario()
        }
    }

    private fun procesarFormulario() {
        val etGamertag = findViewById<EditText>(R.id.etGamertag)
        val etEdad = findViewById<EditText>(R.id.etEdad)
        val etVideojuegoFavorito = findViewById<EditText>(R.id.etVideojuegoFavorito)

        val gamertag = etGamertag.text.toString()
        val edad = etEdad.text.toString().toInt()
        val videojuegoFavorito = etVideojuegoFavorito.text.toString()


        val formulario = Formulario(gamertag, edad, videojuegoFavorito) //se declara una instancia de Formulario

        val tvResultadoGamertag = findViewById<TextView>(R.id.tvResultadoGamertag)
        val tvResultadoEdad = findViewById<TextView>(R.id.tvResultadoEdad)
        val tvResultadovideojuegoFavorito = findViewById<TextView>(R.id.tvResultadovideojuegoFavorito)

        tvResultadoGamertag.text = "Gamertag: ${formulario.gamertag}" //se llama por la instancia
        tvResultadoEdad.text = "Edad: ${formulario.edad}"
        tvResultadovideojuegoFavorito.text = "Videojuego Favorito: ${formulario.videojuegoFavorito}"
    }
}