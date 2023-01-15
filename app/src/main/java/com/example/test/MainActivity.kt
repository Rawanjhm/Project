package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById(R.id.btnLogIn) as Button
//        btnClickMe.setOnClickListener { print("hi")}


        val editTextUserName = findViewById(R.id.userNameTxt) as EditText
        val editTextPassword = findViewById(R.id.passwordTxtId) as EditText


        btnClickMe.setOnClickListener {
            val passwordTxt = editTextPassword.text.toString()

           if (passwordTxt.length != 5) {
               Toast.makeText(this@MainActivity, "password should be 5 elements", Toast.LENGTH_SHORT).show()

           }else
           {
               val intent = Intent(this, homePage::class.java)
               val showString = editTextUserName.text.toString()
               intent.putExtra("Username",showString)
               startActivity(intent)

           }


        }

//
    }
}