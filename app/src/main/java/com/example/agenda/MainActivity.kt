package com.example.agenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvPersonas: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvPersonas  = findViewById(R.id.rvPersonas)

        override fun onResesume(){
            super.onResume()
            val adaptador = adaptador
            rvPersonas.adapter = adaptador
            rvPersonas.layaoutManager = linearLayaoutManager(this)
        }
        fun onClickpersona(persona: Persona){
            val intent = Intent( this, Editar::class.java)
            intent.putExtra("nombre",persona.nombre)
            intent.putExtra("apellido",persona.apellido)
            intent.putExtra("edad",persona.edad)
            startActivity(intent)

        }

         fun mandarAgregar(v: View){
             val intent = Intent(
                 this, AgregarActivity::class.java)
             startActivity(intent)
         }
    }
}