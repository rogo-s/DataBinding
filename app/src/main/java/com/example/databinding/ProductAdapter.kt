package com.example.databinding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.databinding.databinding.ItemProductBinding

class ProductAdapter (var listProduk : ArrayList<ListProduct>):
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    class ViewHolder(val binding : ItemProductBinding) : RecyclerView.ViewHolder(binding.root) {
//        var nama = view.findViewById<TextView>(R.id.namaProduk)
//        var harga = view.findViewById<TextView>(R.id.harga)
//        var stok = view.findViewById<TextView>(R.id.stokProduk)
//        var gambar = view.findViewById<ImageView>(R.id.gambar)

        fun bindProduct(itemData : ListProduct){
            binding.product = itemData
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapter.ViewHolder {
        var view = ItemProductBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ProductAdapter.ViewHolder, position: Int) {
        var dataProduct = listProduk[position]
        holder.bindProduct(listProduk[position])

    }

    override fun getItemCount(): Int {
        return listProduk.size

    }
}