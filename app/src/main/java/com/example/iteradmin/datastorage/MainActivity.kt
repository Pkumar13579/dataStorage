package com.example.iteradmin.datastorage

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edittext:EditText = findViewById<EditText>(R.id.editText)
        val add=findViewById<Button>(R.id.add)

        val sp:SharedPreferences = getSharedPreferences("data",
                Context.MODE_PRIVATE)
        val editor:SharedPreferences.Editor = sp.edit()


        add.setOnClickListener {
            startActivity(Intent(this,Main2Activity::class.java))
            editor.putString("name",edittext.text.toString())
            editor.apply()
        }
    }
}
