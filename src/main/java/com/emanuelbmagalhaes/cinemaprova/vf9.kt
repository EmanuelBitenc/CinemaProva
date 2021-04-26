package com.emanuelbmagalhaes.cinemaprova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class vf9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vf9)
    }

    fun voltar(view: View) {
        val it = Intent(this,filmes::class.java);
        startActivity(it);
    }
}