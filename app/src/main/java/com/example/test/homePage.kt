package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class homePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        //// toolBar With Back Button
        val actionbar = supportActionBar

        actionbar?.setDisplayHomeAsUpEnabled(true)
        actionbar?.setDisplayHomeAsUpEnabled(true)


        val profileName = intent.getStringExtra("Username")
        val userNameTxt: TextView = findViewById(R.id.user_name) as TextView
        userNameTxt.text = "Welcome  " + profileName

    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}