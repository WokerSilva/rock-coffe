package com.example.rock_coffe.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rock_coffe.R
import com.google.android.material.button.MaterialButton

class CafeAdapter(
    private val cafes: List<Cafe>,
    private val onAgregarClick: (Cafe) -> Unit
) : RecyclerView.Adapter<CafeAdapter.CafeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CafeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cafe, parent, false)
        return CafeViewHolder(view)
    }

    override fun onBindViewHolder(holder: CafeViewHolder, position: Int) {
        val cafe = cafes[position]
        holder.nombre.text = cafe.nombre
        holder.descripcion.text = cafe.descripcion
        holder.precio.text = cafe.precio
        holder.imagen.setImageResource(cafe.imagenResId)
        holder.btnAgregar.setOnClickListener { onAgregarClick(cafe) }
    }

    override fun getItemCount() = cafes.size

    class CafeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imagen: ImageView = itemView.findViewById(R.id.imgCafe)
        val nombre: TextView = itemView.findViewById(R.id.tvNombreCafe)
        val descripcion: TextView = itemView.findViewById(R.id.tvDescripcionCafe)
        val precio: TextView = itemView.findViewById(R.id.tvPrecioCafe)
        val btnAgregar: MaterialButton = itemView.findViewById(R.id.btnAgregar)
    }
}