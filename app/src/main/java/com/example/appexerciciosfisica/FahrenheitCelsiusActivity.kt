package com.example.appexerciciosfisica

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FahrenheitCelsiusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fahrenheit_celsius)

        val fahrenheit = findViewById<EditText>(R.id.edtFahrenheit)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {

            val f = fahrenheit.text.toString().toDoubleOrNull()

            if (f != null) {

                val celsius = 5 * (f - 32) / 9

                resultado.text =
                    "%.2f °F = %.2f °C".format(f, celsius)

            } else {

                resultado.text = "Digite uma temperatura válida."
            }
        }
    }
}