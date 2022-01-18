package dev.ogabek.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var signUpBtn: Button
    private lateinit var et_username: EditText
    private lateinit var et_password:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        signUpBtn = findViewById(R.id.btn_sign_up)
        et_username = findViewById(R.id.et_username)
        et_password = findViewById(R.id.et_password)
        val text = "Username :  $et_username\nPassword :  $et_password"
        signUpBtn.setOnClickListener {
            Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
        }
    }
}