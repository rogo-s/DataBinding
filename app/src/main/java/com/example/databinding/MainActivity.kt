package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val listProdukData = arrayListOf(
            ListProduct("LifeBoy","Rp.8000", "100" , R.drawable.ic_launcher_foreground),
            ListProduct("LifeBoy","Rp.8000", "100" , R.drawable.ic_launcher_foreground),
            ListProduct("LifeBoy","Rp.8000", "100" , R.drawable.ic_launcher_foreground),
            ListProduct("LifeBoy","Rp.8000", "100" , R.drawable.ic_launcher_foreground),
            ListProduct("LifeBoy","Rp.8000", "100" , R.drawable.ic_launcher_foreground)

        )
        val adapterProduk = ProductAdapter(listProdukData)
        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvProduk.layoutManager = lm
        binding.rvProduk.adapter = adapterProduk
    }

}