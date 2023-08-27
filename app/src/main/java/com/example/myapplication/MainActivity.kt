package com.example.myapplication

import android.R
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            hadir.setOnClickListener{
                Toast.makeText(this@MainActivity, "Hello "+name.text, Toast.LENGTH_LONG).show()
            }
            tidakHadir.setOnClickListener{
                Toast.makeText(this@MainActivity, "Mohon konfirmasi ke Dosen", Toast.LENGTH_LONG).show()
            }
        }
    }
}