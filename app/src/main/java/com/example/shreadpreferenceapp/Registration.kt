package com.example.shreadpreferenceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        var registration:TextView=findViewById(R.id.textView2)
        registration.setOnClickListener {
            var i=Intent(this,Login::class.java)
            startActivity(i)


        }
    }
}