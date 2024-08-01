package com.example.shreadpreferenceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pb:ProgressBar=findViewById(R.id.progressBar)
        var count=0
        Thread(Runnable {
            while (count<=100)
            {
                Thread.sleep(50)
                count++
                pb.setProgress(count)
            }
            if(count>100)
            {
                var i=Intent(this,Registration::class.java)
                startActivity(i)
            }
        }).start()
    }
}