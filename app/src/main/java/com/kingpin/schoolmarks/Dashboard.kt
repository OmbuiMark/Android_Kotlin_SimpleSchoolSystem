package com.kingpin.schoolmarks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kingpin.schoolmarks.databinding.ActivityDashboardBinding
import com.kingpin.schoolmarks.databinding.ActivityMainBinding

class Dashboard : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.admin.setOnClickListener{
            Toast.makeText(applicationContext,"You clicked the admin button",Toast.LENGTH_SHORT).show()
        }
    }
}