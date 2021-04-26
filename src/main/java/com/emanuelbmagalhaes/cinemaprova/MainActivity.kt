package com.emanuelbmagalhaes.cinemaprova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun filmes(view: View) {
        val it = Intent(this,filmes::class.java);
        startActivity(it);
        }

    fun kong(view: View) {
        val it = Intent(this,kong::class.java);
        startActivity(it);
    }

    fun generos(view: View) {
        val it = Intent(this,generos::class.java);
        startActivity(it);
    }


    }

