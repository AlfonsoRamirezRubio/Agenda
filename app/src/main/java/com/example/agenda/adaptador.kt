package com.example.agenda

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class adaptador (contexto: Context):
 RecyclerView.Adapter<Adaptador.ViewHolderPersona>() {

    class ViewHolderPersona(item: view){
        var txtNombre:TextView = item.findViewById(R.id.txtNombre)
        var txtApellido:TextView = item.findViewById(R.id.txtApellido)
        var txtEdad:TextView = item.findViewById(R.id.txtEdad)
    }
    // sirve para especificar la vista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adaptador.ViewHolderPersona {
        val layaoutItem = LayaoutInflater.from(parent.context)
            .inflate(R.layout.item_view, parent, false)
        return ViewHolderPersona(layaoutItem)
    }
        override fun getItemCount(): Int
            = Provisional.listPersona.zise

    override fun getItemCount(): Int {
        val persona = Provisonal.listPersona[position]
        holder.txtNombre.text = persona.nombre
        holder.txtApellido.text = persona.apellido
        holder.txtEdad.text = persona.edad.toString()
        holder .itemView.setOnClick

    }
}