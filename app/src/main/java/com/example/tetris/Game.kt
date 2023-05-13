package com.example.tetris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import kotlin.random.Random

lateinit var b1 : Button
lateinit var b2 : Button
lateinit var b3 : Button
lateinit var b4 : Button
lateinit var b5 : Button
lateinit var b6 : Button
lateinit var b7 : Button
lateinit var b8 : Button
lateinit var b9 : Button
lateinit var b10 : Button
lateinit var b11 : Button
lateinit var b12 : Button

class Game : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game)

        next_shape()

    }

    var nextUp:Int = 0
    var starting = 0
    var num1 = 0
    var num2 = 0
    var num3 = 0
    var num4 = 0

    var shape_is = 0
    var stop = 0
    var lines = 0
    var once = 0

    private fun next_shape() {

        b1 = findViewById(R.id.b1)
        b2 = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)
        b4 = findViewById(R.id.b4)
        b5 = findViewById(R.id.b5)
        b6 = findViewById(R.id.b6)
        b7 = findViewById(R.id.b7)
        b8 = findViewById(R.id.b8)
        b9 = findViewById(R.id.b9)
        b10 = findViewById(R.id.b10)
        b11 = findViewById(R.id.b11)
        b12 = findViewById(R.id.b12)

        b1.setBackgroundResource(R.drawable.grid_grey);
        b2.setBackgroundResource(R.drawable.grid_grey);
        b3.setBackgroundResource(R.drawable.grid_grey);
        b4.setBackgroundResource(R.drawable.grid_grey);
        b5.setBackgroundResource(R.drawable.grid_grey);
        b6.setBackgroundResource(R.drawable.grid_grey);
        b7.setBackgroundResource(R.drawable.grid_grey);
        b8.setBackgroundResource(R.drawable.grid_grey);
        b9.setBackgroundResource(R.drawable.grid_grey);
        b10.setBackgroundResource(R.drawable.grid_grey);
        b11.setBackgroundResource(R.drawable.grid_grey);
        b12.setBackgroundResource(R.drawable.grid_grey);

        val random = Random.nextInt(1,7)

        when(random) {
            1 -> {b9.setBackgroundResource(R.drawable.red);
                b10.setBackgroundResource(R.drawable.red);
                b11.setBackgroundResource(R.drawable.red);
                b12.setBackgroundResource(R.drawable.red);}
            2 -> {b7.setBackgroundResource(R.drawable.orange);
                b8.setBackgroundResource(R.drawable.orange);
                b11.setBackgroundResource(R.drawable.orange);
                b12.setBackgroundResource(R.drawable.orange);}
            3 -> {b8.setBackgroundResource(R.drawable.yellow);
                b9.setBackgroundResource(R.drawable.yellow);
                b11.setBackgroundResource(R.drawable.yellow);
                b12.setBackgroundResource(R.drawable.yellow);}
            4 -> {b7.setBackgroundResource(R.drawable.green);
                b10.setBackgroundResource(R.drawable.green);
                b11.setBackgroundResource(R.drawable.green);
                b12.setBackgroundResource(R.drawable.green);}
            5 -> {b9.setBackgroundResource(R.drawable.blue);
                b8.setBackgroundResource(R.drawable.blue);
                b11.setBackgroundResource(R.drawable.blue);
                b10.setBackgroundResource(R.drawable.blue);}
            6 -> {b8.setBackgroundResource(R.drawable.purple);
                b10.setBackgroundResource(R.drawable.purple);
                b11.setBackgroundResource(R.drawable.purple);
                b12.setBackgroundResource(R.drawable.purple);}
            7 -> {b2.setBackgroundResource(R.drawable.pink);
                b5.setBackgroundResource(R.drawable.pink);
                b8.setBackgroundResource(R.drawable.pink);
                b11.setBackgroundResource(R.drawable.pink);}

        }

        nextUp = random
        if (once == 0) {
            b1.setBackgroundResource(R.drawable.grid_grey);
            b2.setBackgroundResource(R.drawable.grid_grey);
            b3.setBackgroundResource(R.drawable.grid_grey);
            b4.setBackgroundResource(R.drawable.grid_grey);
            b5.setBackgroundResource(R.drawable.grid_grey);
            b6.setBackgroundResource(R.drawable.grid_grey);
            b7.setBackgroundResource(R.drawable.grid_grey);
            b8.setBackgroundResource(R.drawable.grid_grey);
            b9.setBackgroundResource(R.drawable.grid_grey);
            b10.setBackgroundResource(R.drawable.grid_grey);
            b11.setBackgroundResource(R.drawable.grid_grey);
            b12.setBackgroundResource(R.drawable.grid_grey);

            b8.setBackgroundResource(R.drawable.yellow);
            b9.setBackgroundResource(R.drawable.yellow);
            b11.setBackgroundResource(R.drawable.yellow);
            b12.setBackgroundResource(R.drawable.yellow);
        }

        if (starting == 0) {
            Handler().postDelayed({shapes()}, 1500)
            starting = 1
        }
    }

    private fun shapes() {

    }

}