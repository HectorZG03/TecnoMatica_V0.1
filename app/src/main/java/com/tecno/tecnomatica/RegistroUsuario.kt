package com.tecno.tecnomatica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton


import androidx.appcompat.widget.Toolbar

class RegistroUsuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_usuario)

        // Configurar la Toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Habilitar el botón de navegación hacia atrás en la Toolbar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        // Configurar el listener de la Toolbar
        toolbar.setNavigationOnClickListener {
            onBackPressed() // Esto llamará a finish() por defecto
        }

        val buttonCancelar = findViewById<MaterialButton>(R.id.buttonCancelar)
        val buttonRegistrar = findViewById<MaterialButton>(R.id.buttonRegistrar)

        buttonCancelar.setOnClickListener {
            onBackPressed() // Usa el mismo comportamiento que la flecha de navegación
        }

        buttonRegistrar.setOnClickListener {
            // Aquí puedes agregar la lógica para registrar al usuario
            // Por ejemplo, validar los campos y guardar la información
        }
    }

    // Opcionalmente, puedes sobrescribir onBackPressed si necesitas lógica adicional
    override fun onBackPressed() {
        // Puedes agregar lógica adicional aquí si es necesario
        super.onBackPressed()
    }
}