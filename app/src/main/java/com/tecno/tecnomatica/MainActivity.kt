package com.tecno.tecnomatica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.card.MaterialCardView
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configura los CardViews para que respondan a los clics
        val registerUserCardView = findViewById<MaterialCardView>(R.id.registerUserCardView)
        val registerEquipmentCardView = findViewById<MaterialCardView>(R.id.registerEquipmentCardView)
        val assignEquipmentCardView = findViewById<MaterialCardView>(R.id.assignEquipmentCardView)
        val historyCardView = findViewById<MaterialCardView>(R.id.historyCardView)
        val logoutButton = findViewById<MaterialButton>(R.id.logoutButton)

        // Al presionar el card de Registro de Usuario
        registerUserCardView.setOnClickListener {
            val intent = Intent(this, RegistroUsuario::class.java)
            startActivity(intent)
        }

        // Al presionar el card de Registro de Equipo
        registerEquipmentCardView.setOnClickListener {
            val intent = Intent(this, RegistrarEquipo::class.java)
            startActivity(intent)
        }

        // Al presionar el card de Asignar Equipo
        assignEquipmentCardView.setOnClickListener {
            val intent = Intent(this, AsignarEquipo::class.java)
            startActivity(intent)
        }

        // Al presionar el card de Historial
        historyCardView.setOnClickListener {
            val intent = Intent(this, Historial::class.java)
            startActivity(intent)
        }

        // Al presionar el botón de cerrar sesión
        logoutButton.setOnClickListener {
            // Aquí puedes agregar lógica para limpiar la sesión si es necesario
            val intent = Intent(this, Login::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }
    }
}