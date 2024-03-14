package com.example.guess_number

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById<TextView>(R.id.textView3)
        var result_textView = findViewById<TextView>(R.id.result_textview)
        var guess_button = findViewById<Button>(R.id.Guess_Button)
        var reset_button = findViewById<Button>(R.id.Reset_Button)
        var editText = findViewById<EditText>(R.id.editTextText)

        guess_button.setOnClickListener {
            textView.text = editText.text
        }


      }
    }
