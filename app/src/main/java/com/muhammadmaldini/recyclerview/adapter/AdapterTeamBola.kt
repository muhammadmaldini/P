package com.muhammadmaldini.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammadmaldini.recyclerview.model.Pemain

class AdapterTeamBola(private val context : Context,
                      private var data : List<Pemain>?)  : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       val binding = ListItemPemainBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = data?.get(position)
        holder.foto
    }

    override fun getItemCount() Int = data?.size ?:0

    inner class ViewHolder( val binding : ListItemPemainBinding): RecyclerView.ViewHolder(view) {
        var foto = binding.image
        var nama = binding.txtnama

    }
}