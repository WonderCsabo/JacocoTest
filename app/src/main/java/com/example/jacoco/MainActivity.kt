package com.example.jacoco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mylibrary.greet

class MainActivity : AppCompatActivity() {
    init {
        greet()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.hello).text =  greet()
    }
}
