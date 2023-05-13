package com.example.tetris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var playBTN : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playBTN = findViewById(R.id.play)

        playBTN.setOnClickListener {
            startActivity(Intent(this, Game::class.java))
            //setContentView(R.layout.game)
        }



    }
}