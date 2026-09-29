package com.example.appexerciciosfisica

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ParalelepipedoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_paralelepipedo)

        val campoA = findViewById<EditText>(R.id.edtA)
        val campoB = findViewById<EditText>(R.id.edtB)
        val campoC = findViewById<EditText>(R.id.edtC)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {

            val a = campoA.text.toString().toDoubleOrNull()
            val b = campoB.text.toString().toDoubleOrNull()
            val c = campoC.text.toString().toDoubleOrNull()

            if (a != null && b != null && c != null) {

                val volume = a * b * c

                resultado.text =
                    "Volume = %.2f".format(volume)

            } else {

                resultado.text = "Digite todos os valores."
            }
        }
    }
}