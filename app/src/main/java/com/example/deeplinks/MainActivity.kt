package com.example.deeplinks

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var message :TextView
    private lateinit var message1:TextView
    private var uri:Uri?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        message = findViewById(R.id.textView)
        message1 = findViewById(R.id.textView2)

        uri = intent.data

        if (uri !=null){

            val values = uri!!.pathSegments

            val param = values[0]
            val param1 = values[1]

            message1.text = param
            message.text = param1
        }
    }
}