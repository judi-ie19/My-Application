package com.example.stopwatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


    class Bmicalculatoractivity : AppCompatActivity() {
        lateinit var btntransaction: Button
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_bmicalculatoractivity)
            btntransaction=findViewById(R.id.btntransaction)
            btntransaction.setOnClickListener {
                val intent= Intent(this ,TransactionAcitivity::class.java)
                startActivity(intent)
            }
        }
    }

