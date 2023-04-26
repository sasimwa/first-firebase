package com.example.firebase_app_sandra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    private lateinit var edtName:EditText
    private lateinit var edtAil:EditText
    private lateinit var edtPass:EditText
    private lateinit var btnAccount:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        edtName = findViewById(R.id.edtname)
        edtAil = findViewById(R.id.edtail)
        edtPass = findViewById(R.id.edtpass)
        btnAccount = findViewById(R.id.btnaccount)


        btnAccount.setOnClickListener {


        }
    }
}