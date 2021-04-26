package com.emanuelbmagalhaes.cinemaprova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class filmes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filmes)
    }

    fun kong(view: View) {
        val it = Intent(this,kong::class.java);
        startActivity(it);
    }

    fun vf9(view: View) {
        val it = Intent(this,vf9::class.java);
        startActivity(it);
    }

    fun voltar(view: View) {
        val it = Intent(this,MainActivity::class.java);
        startActivity(it);
    }
}