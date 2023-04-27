package com.example.firebase_app_sandra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {


    private lateinit var edtMail:EditText
    private lateinit var edtPassword:EditText
    private lateinit var btnLogin:Button
    private lateinit var btnRegister:Button
    private lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edtMail = findViewById(R.id.edtmail)
        edtPassword = findViewById(R.id.edtpassword)
        btnLogin = findViewById(R.id.btnlogin)
        btnRegister = findViewById(R.id.btnregister)

        auth = FirebaseAuth.getInstance()


        btnRegister.setOnClickListener {

            //navigate user to registration page
            var gotoreg = Intent(this,RegisterActivity::class.java)
            startActivity(gotoreg)
        }

        btnLogin.setOnClickListener {

            var email= edtMail.text.toString().trim()
            var password = edtPassword.toString().trim()

            //validate

            if (email.isEmpty()||password.isEmpty()){
                Toast.makeText(this, "CANNOT SUBMIT AN EMPTY FIELD", Toast.LENGTH_SHORT).show()


        }else{
            auth.signInWithEmailAndPassword(email,password).addOnCompleteListener(this){
                if (it.isSuccessful){
                    Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show()

                    var gotomain = Intent(this,MainActivity::class.java)
                    startActivity(gotomain)
                    finish()


            }


            }



        }

            }
    }
}