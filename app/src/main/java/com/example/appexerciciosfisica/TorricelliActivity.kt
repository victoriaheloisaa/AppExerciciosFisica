package com.example.appexerciciosfisica

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt

class TorricelliActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_torricelli)

        val v0 = findViewById<EditText>(R.id.edtV0)
        val aceleracao = findViewById<EditText>(R.id.edtAceleracao)
        val deslocamento = findViewById<EditText>(R.id.edtDeslocamento)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {

            val velocidadeInicial = v0.text.toString().toDoubleOrNull()
            val a = aceleracao.text.toString().toDoubleOrNull()
            val deltaS = deslocamento.text.toString().toDoubleOrNull()

            if (velocidadeInicial != null &&
                a != null &&
                deltaS != null) {

                val valorRaiz =
                    velocidadeInicial * velocidadeInicial +
                            2 * a * deltaS

                if (valorRaiz >= 0) {

                    val velocidadeFinal = sqrt(valorRaiz)

                    resultado.text =
                        "Velocidade final = %.2f m/s"
                            .format(velocidadeFinal)

                } else {

                    resultado.text =
                        "Não existe resultado real."
                }

            } else {

                resultado.text = "Digite todos os valores."
            }
        }
    }
}