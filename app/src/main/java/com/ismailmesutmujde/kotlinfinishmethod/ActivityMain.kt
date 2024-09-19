package com.ismailmesutmujde.kotlinfinishmethod

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinfinishmethod.databinding.ActivityMainBinding


class ActivityMain : AppCompatActivity() {

    private lateinit var bindingMain : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        bindingMain.buttonPlay.setOnClickListener {
            val intent = Intent(this@ActivityMain, ActivityGameScreen::class.java)
            startActivity(intent)
        }
    }
}