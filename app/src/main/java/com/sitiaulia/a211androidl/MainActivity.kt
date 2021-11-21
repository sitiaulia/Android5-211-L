package com.sitiaulia.a211androidl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpanBt = findViewById<Button>(R.id.simpan)
        val batalBt = findViewById<Button>(R.id.batal)

        val namaEt = findViewById<EditText>(R.id.et_nama)
        val emailEt = findViewById<EditText>(R.id.et_email)
        val phoneEt = findViewById<EditText>(R.id.et_phone)
        val lahirEt = findViewById<EditText>(R.id.et_lahir)
        val sksEt = findViewById<EditText>(R.id.et_sks)

        simpanBt.setOnClickListener {
            val nama = namaEt.text.toString()
            val email = emailEt.text.toString()
            var sks = sksEt.text.toString().toInt()
            sks = 160 - sks
            Toast.makeText(this, "Sisa SKS... $sks", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("email", email)
            intent.putExtra("sks", sks)
            startActivity(intent)
        }

        batalBt.setOnClickListener {
            Toast.makeText(this, "batal...", Toast.LENGTH_SHORT).show()
        }
    }
}