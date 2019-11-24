package com.example.spidemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.api.IFunction
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadServices()
    }

    private fun loadServices() {
        ServiceLoader.load(IFunction::class.java).forEach {
            Log.i("MainActivity", "function class = " + it::class.java + " function name = " + it.name)
        }
    }
}
