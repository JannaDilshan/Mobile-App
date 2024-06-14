package com.example.emart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.emart .databinding.ActivityListDetailedBinding

class DetailedActivity : AppCompatActivity() {
    private lateinit var binding:ActivityListDetailedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListDetailedBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = this.intent
        if (intent != null) {
            val name = intent.getStringExtra("name")
            val desc = intent.getIntExtra("desc", R.string.Monitor)
            val image = intent.getIntExtra("image", R.drawable.monitor)
            binding.detailName.text = name
            binding.detailDesc.setText(desc)
            binding.detailImage.setImageResource(image)
        }
    }
}