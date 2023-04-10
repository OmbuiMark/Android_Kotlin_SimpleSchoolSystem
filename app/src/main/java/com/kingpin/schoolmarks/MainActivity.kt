package com.kingpin.schoolmarks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import com.kingpin.schoolmarks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.teacher.setOnClickListener {
            val intent = Intent(this,Dashboard::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext,"Welcome Teacher",Toast.LENGTH_LONG).show()
        }
        binding.admin.setOnClickListener {
            //val intent = Intent(this,Admin::class.java)
            //startActivity(intent)
            //Toast.makeText(applicationContext,"Welcome Admin ",Toast.LENGTH_LONG).show()

        }
        }
    }
