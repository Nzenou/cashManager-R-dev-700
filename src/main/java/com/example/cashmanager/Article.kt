package com.example.cashmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.INVISIBLE
import kotlinx.android.synthetic.main.activity_article.*

class Article : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)

        var nombre=0
        Log.d("TAG", nombre.toString())
       button.setOnClickListener {
           nombre=nombre+1
           Log.d("TAG", nombre.toString())
       }
        if (nombre>0){
            fun hacerVisibleLaFoto(v: View) {
                article1.visibility = View.INVISIBLE
            }
        }
    }
}
