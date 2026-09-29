package com.example.appexerciciosfisica

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ForcaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_forca)

        val massa = findViewById<EditText>(R.id.edtMassa)
        val aceleracao = findViewById<EditText>(R.id.edtAceleracao)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {

            val m = massa.text.toString().toDoubleOrNull()
            val a = aceleracao.text.toString().toDoubleOrNull()

            if (m != null && a != null) {

                val forca = m * a

                resultado.text =
                    "Força = %.2f N".format(forca)

            } else {

                resultado.text = "Digite valores válidos."
            }
        }
    }
}