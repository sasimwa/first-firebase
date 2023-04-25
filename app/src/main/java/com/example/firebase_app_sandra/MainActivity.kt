package com.example.firebase_app_sandra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    private lateinit var edtInput:EditText
    private lateinit var btnSave:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtInput = findViewById(R.id.edtinput)
        btnSave = findViewById(R.id.btnsave)


        var database = FirebaseDatabase.getInstance()
        var databaseRef = database.reference

        btnSave.setOnClickListener {


            var user_data = edtInput.text.toString().trim()

            databaseRef.setValue(user_data)

            //Toast.makeText(this, user_data, Toast.LENGTH_SHORT).show()
        }

    }
}