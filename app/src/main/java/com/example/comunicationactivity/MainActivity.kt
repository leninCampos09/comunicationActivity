package com.example.comunicationactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var nombre: EditText
    private lateinit var edad: EditText
    private lateinit var enviar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        nombre = findViewById(R.id.etNombre)
        edad = findViewById(R.id.etEdad)
        enviar = findViewById(R.id.btnEnviar)



        enviar.setOnClickListener {
            val nombre = nombre.text.toString()
            val edad = edad.text.toString()

            val Intent = Intent(this, Actividad2::class.java)

            Intent.putExtra("nombre",nombre)
            Intent.putExtra("edad",edad)
            startActivity(Intent)
        }
    }
}