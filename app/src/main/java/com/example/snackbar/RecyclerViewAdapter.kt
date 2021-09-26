package com.example.snackbar
import android.view.LayoutInflater
import android.content.Context;
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class RecyclerViewAdapter (val context : Context, private val textlist: ArrayList<String>):RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>(){
    class ItemViewHolder(itemView : View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return  ItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_row,parent,false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val texts = textlist[position]
        holder.itemView.apply { tvColor.text = texts }
    }

    override fun getItemCount() = textlist.size
}