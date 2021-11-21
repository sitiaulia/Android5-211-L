package com.sitiaulia.a211androidl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val namaTv = findViewById<TextView>(R.id.tv_nama_isi)
        val emailTv = findViewById<TextView>(R.id.tv_email_isi)

        val nama = intent.getStringExtra("nama")
        val email = intent.getStringExtra("email")
        val sks = intent.getIntExtra("sks", 0)

        namaTv.text = nama
        emailTv.text = email
    }
}