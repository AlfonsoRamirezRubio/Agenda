package com.example.agenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Editar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar)
        //recuperar los datos enviados
        val nombre = intent.getStringExtra("nombre")
        toast.makeText(this,"Recibi $nombre",toast.LENGTH_LONG).show()
    }
}