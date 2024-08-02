package com.example.shreadpreferenceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var edtSurname:EditText=findViewById(R.id.edtSurname)
        var edtName:EditText=findViewById(R.id.edtName)

        var edtEmail:EditText=findViewById(R.id.edtEmail)
        edtEmail.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) { }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    if(!android.util.Patterns.EMAIL_ADDRESS.matcher(p0).matches())
                    {
                        edtEmail.setError("Invalid Input")
                    }
            }
            override fun afterTextChanged(p0: Editable?) { }


        })
        var edtPass:EditText=findViewById(R.id.edtPass)
        var edtBirthDate:EditText=findViewById(R.id.edtDateBirth)

        var str:String=""
        var gender:RadioGroup=findViewById(R.id.gender)
        gender.setOnCheckedChangeListener { radioGroup, i ->
            var rb=findViewById< RadioButton >(i)
        str=rb.text.toString()
        }

        var actvcity:AutoCompleteTextView=findViewById(R.id.City)
        var city= arrayOf("Rajkot","Baroda","Jamnagar","Surat")
        var adapter=ArrayAdapter<String>(this,android.R.layout.simple_selectable_list_item,city)
        actvcity.setAdapter(adapter)

    var submitButton:Button=findViewById(R.id.button2)
    submitButton.setOnClickListener {
        var i=Intent(this,Display::class.java)
        i.putExtra("Surname",edtSurname.text.toString())
        i.putExtra("Name",edtName.text.toString())
        i.putExtra("Email",edtEmail.text.toString())
        i.putExtra("Password",edtPass.text.toString())
        i.putExtra("BirthDate",edtBirthDate.text.toString())
        i.putExtra("Gender",str)
        i.putExtra("City",actvcity.text.toString())
      startActivity(i)
    }
    }
}