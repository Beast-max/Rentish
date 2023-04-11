package com.example.rantish.Rents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rantish.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rents)
    }
}