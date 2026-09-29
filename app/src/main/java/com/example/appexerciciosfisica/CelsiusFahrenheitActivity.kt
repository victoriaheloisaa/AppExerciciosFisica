package com.example.appexerciciosfisica

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CelsiusFahrenheitActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_celsius_fahrenheit)

        val celsius = findViewById<EditText>(R.id.edtCelsius)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {

            val c = celsius.text.toString().toDoubleOrNull()

            if (c != null) {

                val fahrenheit = (9 * c + 160) / 5

                resultado.text =
                    "%.2f °C = %.2f °F".format(c, fahrenheit)

            } else {

                resultado.text = "Digite uma temperatura válida."
            }
        }
    }
}