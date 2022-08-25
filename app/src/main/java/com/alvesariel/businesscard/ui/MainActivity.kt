package com.alvesariel.businesscard.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alvesariel.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListener()
    }

    private fun insertListener() {

        //direcionando o clique do botão para a view de formulário

        binding.fab.setOnClickListener {
            val intent = Intent(this@MainActivity, AddBusinessCardActivity::class.java)
            startActivity(intent)
        }
    }


}