package com.example.firebase_app_sandra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {
    private lateinit var edtName:EditText
    private lateinit var edtAil:EditText
    private lateinit var edtPass:EditText
    private lateinit var btnAccount:Button
    private lateinit var auth:FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        edtName = findViewById(R.id.edtname)
        edtAil = findViewById(R.id.edtail)
        edtPass = findViewById(R.id.edtpass)
        btnAccount = findViewById(R.id.btnaccount)
        auth = FirebaseAuth.getInstance()


        btnAccount.setOnClickListener {

            var name = edtName.text.toString().trim()
            var email = edtAil.text.toString().trim()
            var password = edtPass.text.toString().trim()

            if (name.isEmpty()||email.isEmpty()||password.isEmpty()) {


                Toast.makeText(this, "Cannot submit an empty field", Toast.LENGTH_SHORT).show()

            }else {

                auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this) {

                    if (it.isSuccessful) {

                        Toast.makeText(this, "User Created Successfully", Toast.LENGTH_SHORT).show()

                        //navigate back to login
                        var gotologin = Intent(this, LoginActivity::class.java)
                        startActivity(gotologin)


                    } else {

                        Log.d("TAG", "Error----->", it.exception)


                        Toast.makeText(this, "Failed to Create Account", Toast.LENGTH_SHORT).show()

                    }



                }


            }




        }

    }
}