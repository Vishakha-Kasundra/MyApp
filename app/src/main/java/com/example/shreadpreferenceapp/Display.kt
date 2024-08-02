package com.example.shreadpreferenceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Display : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

var tv1:TextView=findViewById(R.id.tv1)
var tv2:TextView=findViewById(R.id.tv2)
var tv3:TextView=findViewById(R.id.tv3)
var tv4:TextView=findViewById(R.id.tv4)
var tv5:TextView=findViewById(R.id.tv5)
var tv6:TextView=findViewById(R.id.tv6)
var tv7:TextView=findViewById(R.id.tv7)

        var int:Intent=intent
        var surname=intent.getStringExtra("Surname")
        var name=intent.getStringExtra("Name")
        var email=intent.getStringExtra("Email")
        var pass=intent.getStringExtra("Password")
        var birthDate=intent.getStringExtra("BirthDate")
        var gender=intent.getStringExtra("Gender")
        var city=intent.getStringExtra("City")

        tv1.setText("Surname: "+surname)
        tv2.setText("Name: "+name)
        tv3.setText("Email: "+email)
        tv4.setText("Password: "+pass)
        tv5.setText("Birthdate: "+birthDate)
        tv6.setText("Gender: "+gender)
        tv7.setText("City: "+city)

    }
}