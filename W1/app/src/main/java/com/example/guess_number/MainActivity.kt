package com.example.guess_number

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val result_textView = findViewById<TextView>(R.id.result_textView)
        val guess_button = findViewById<Button>(R.id.guess_button)
        val reset_button = findViewById<Button>(R.id.reset_button)
        val editText = findViewById<EditText>(R.id.editText)
        var validate_num:Int
        var secret : Int = Random().nextInt(10)+1

        guess_button.setOnClickListener {
            textView.text = editText.text
            validate_num = editText.text.toString().toInt() - secret
            var ans_str: String = "恭喜!你猜對了!!!"

            if (validate_num > 0) {
                ans_str = "你猜太大了!!"

            } else if (validate_num < 0) {
                ans_str = "你猜小了，猜大一些~"
            }else{
                textView.text="重新來一次吧~"
            }
            textView.text=ans_str


        }
        reset_button.setOnClickListener{
            secret= Random().nextInt( 10) + 1
            textView.text="再猜一次XD"
        }
    }

}