package com.example.mad_practical_4_21012021004

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signup: Button = findViewById(R.id.signup)

        signup.setOnClickListener {
            Intent(this@login_activity, registration_activity::class.java).also {
                startActivity(it)
            }
        }
    }
}