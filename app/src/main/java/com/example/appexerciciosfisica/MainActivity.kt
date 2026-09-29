package com.example.appexerciciosfisica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnVelocidade).setOnClickListener {
            startActivity(Intent(this, VelocidadeActivity::class.java))
        }

        findViewById<Button>(R.id.btnForca).setOnClickListener {
            startActivity(Intent(this, ForcaActivity::class.java))
        }

        findViewById<Button>(R.id.btnEnergia).setOnClickListener {
            startActivity(Intent(this, EnergiaActivity::class.java))
        }

        findViewById<Button>(R.id.btnFahrenheitCelsius).setOnClickListener {
            startActivity(Intent(this, FahrenheitCelsiusActivity::class.java))
        }

        findViewById<Button>(R.id.btnCelsiusFahrenheit).setOnClickListener {
            startActivity(Intent(this, CelsiusFahrenheitActivity::class.java))
        }

        findViewById<Button>(R.id.btnParalelepipedo).setOnClickListener {
            startActivity(Intent(this, ParalelepipedoActivity::class.java))
        }

        findViewById<Button>(R.id.btnTorricelli).setOnClickListener {
            startActivity(Intent(this, TorricelliActivity::class.java))
        }

        findViewById<Button>(R.id.btnDiluicao).setOnClickListener {
            startActivity(Intent(this, DiluicaoActivity::class.java))
        }
    }
}