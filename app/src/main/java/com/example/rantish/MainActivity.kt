package com.example.rantish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = this.findNavController(R.id.fragment_container)
        // Find reference to bottom navigation view
        val navView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        // Hook your navigation controller to bottom navigation view
        navView.setupWithNavController(navController)
    }
}