package com.thc.hiddensecrets.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thc.hiddensecrets.R

class ProfileActivity : AppCompatActivity() {
    lateinit var recyclerView3: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        recyclerView3 = findViewById(R.id.recyclerView) // Certifique-se de ter um RecyclerView no seu layout
        recyclerView3.layoutManager = LinearLayoutManager(this)

        // Exemplo de URLs de imagens
        val imageUrls = listOf(
            "https://files.tecnoblog.net/wp-content/uploads/2022/09/stable-diffusion-imagem.jpg",
            "https://cdn.pixabay.com/photo/2024/06/06/22/19/piece-8813495_640.png",
            "https://files.tecnoblog.net/wp-content/uploads/2022/09/stable-diffusion-imagem.jpg",
            "https://cdn.pixabay.com/photo/2024/06/06/22/19/piece-8813495_640.png",
            "https://files.tecnoblog.net/wp-content/uploads/2022/09/stable-diffusion-imagem.jpg",
            "https://cdn.pixabay.com/photo/2024/06/06/22/19/piece-8813495_640.png",
            "https://files.tecnoblog.net/wp-content/uploads/2022/09/stable-diffusion-imagem.jpg",
            "https://cdn.pixabay.com/photo/2024/06/06/22/19/piece-8813495_640.png",
            // Adicione mais URLs conforme necessário
        )

        val myAdapter = MyAdapter(this, imageUrls)
        recyclerView3.layoutManager = LinearLayoutManager(this)
        recyclerView3.adapter = myAdapter
    }
}