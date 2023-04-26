package com.example.firebase_app_sandra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {


    private lateinit var edtMail:EditText
    private lateinit var edtPassword:EditText
    private lateinit var btnLogin:Button
    private lateinit var btnRegister:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edtMail = findViewById(R.id.edtmail)
        edtPassword = findViewById(R.id.edtpassword)
        btnLogin = findViewById(R.id.btnlogin)
        btnRegister = findViewById(R.id.btnregister)


        btnRegister.setOnClickListener {

            //navigate user to registration page
            var gotoreg = Intent(this,RegisterActivity::class.java)
            startActivity(gotoreg)
        }

        btnLogin.setOnClickListener {


        }
    }
}