package com.example.appexerciciosfisica

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DiluicaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_diluicao)

        val c1 = findViewById<EditText>(R.id.edtC1)
        val v1 = findViewById<EditText>(R.id.edtV1)
        val c2 = findViewById<EditText>(R.id.edtC2)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {

            val concentracao1 = c1.text.toString().toDoubleOrNull()
            val volume1 = v1.text.toString().toDoubleOrNull()
            val concentracao2 = c2.text.toString().toDoubleOrNull()

            if (concentracao1 != null &&
                volume1 != null &&
                concentracao2 != null &&
                concentracao2 != 0.0) {

                val volume2 =
                    (concentracao1 * volume1) / concentracao2

                resultado.text =
                    "V2 = %.2f".format(volume2)

            } else {

                resultado.text =
                    "Digite valores válidos."
            }
        }
    }
}