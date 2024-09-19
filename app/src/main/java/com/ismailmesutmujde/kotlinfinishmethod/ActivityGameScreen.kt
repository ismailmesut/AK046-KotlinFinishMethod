package com.ismailmesutmujde.kotlinfinishmethod

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinfinishmethod.databinding.ActivityGameScreenBinding


class ActivityGameScreen : AppCompatActivity() {

    private  lateinit var bindingGameScreen : ActivityGameScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingGameScreen = ActivityGameScreenBinding.inflate(layoutInflater)
        val view = bindingGameScreen.root
        setContentView(view)

        bindingGameScreen.buttonFinish.setOnClickListener {
            val intent = Intent(this@ActivityGameScreen, ActivityResult::class.java)
            finish()
            startActivity(intent)
        }

    }
}