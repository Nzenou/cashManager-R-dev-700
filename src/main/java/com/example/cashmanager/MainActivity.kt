package com.example.cashmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Accroche.text="hello kotlin"

        //Fecth all views

        var ipserver = findViewById(R.id.editText3) as TextView
        var password = findViewById(R.id.editText4) as TextView
        var button = findViewById(R.id.button4) as Button


        button.setOnClickListener {

            var text1 = ipserver.text.toString()
            var text2 = password.text.toString()
            Log.d("TAG", text1)
            Log.d("TAG", text2)

            //creating the Intent which permit to go to one activity to another
            var intent = Intent(this@MainActivity,Article::class.java)

            if (text1=="nathann" && text2=="zenou" )run {
            startActivity(intent)
        }

        }
    }
}
