package com.example.messejeri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import com.example.messejeri.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var bindingClass : ActivityMain2Binding
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btn1.setOnClickListener {
            openSettings()
        }
    }

    fun openSettings() {
        var valintent = Intent(Settings.ACTION_SETTINGS)
        startActivity(valintent)
    }
}