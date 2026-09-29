package com.example.appexerciciosfisica

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class VelocidadeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_velocidade)

        val distancia = findViewById<EditText>(R.id.edtDistancia)
        val tempo = findViewById<EditText>(R.id.edtTempo)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {

            val d = distancia.text.toString().toDoubleOrNull()
            val t = tempo.text.toString().toDoubleOrNull()

            if (d != null && t != null && t != 0.0) {

                val velocidade = d / t

                resultado.text =
                    "Velocidade = %.2f".format(velocidade)

            } else {

                resultado.text = "Digite valores válidos."
            }
        }
    }
}