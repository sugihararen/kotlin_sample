package com.example.kotlin_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tx: TextView = findViewById(R.id.tv)
        var btnDog: Button = findViewById(R.id.btnDog)
        var btnCat:Button = findViewById(R.id.btnCat)
        var btnClear:Button = findViewById(R.id.btnClear)
        btnDog.setOnClickListener {
            tx.text = "DOG"
        }
        btnCat.setOnClickListener {
            tx.text = "CAT"
        }
        btnClear.setOnClickListener {
            tx.text = "..."
        }
    }
}
