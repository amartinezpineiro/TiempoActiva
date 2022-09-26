package com.example.tiempoactiva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var start= System.nanoTime()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Estado", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Estado","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Estado","onResume")
    }

    override fun onPause() {
        super.onPause()
        val time =System.nanoTime() - start/1000000
        Log.d("Estado","onPause $time")
    }
}