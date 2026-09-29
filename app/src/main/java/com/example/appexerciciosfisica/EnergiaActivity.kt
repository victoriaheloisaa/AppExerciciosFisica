package com.example.appexerciciosfisica

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EnergiaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_energia)

        val massa = findViewById<EditText>(R.id.edtMassa)
        val velocidade = findViewById<EditText>(R.id.edtVelocidade)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {

            val m = massa.text.toString().toDoubleOrNull()
            val v = velocidade.text.toString().toDoubleOrNull()

            if (m != null && v != null) {

                val energia = (m * v * v) / 2

                resultado.text =
                    "Energia = %.2f J".format(energia)

            } else {

                resultado.text = "Digite valores válidos."
            }
        }
    }
}