package com.example.hw6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.hw6.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    val TAG:String = MainActivity::class.java.simpleName
    private lateinit var handler: Handler
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val textView = findViewById<TextView>(R.id.textView)
        val result_textView = findViewById<TextView>(R.id.result_textView)
        val guess_button = findViewById<Button>(R.id.guess_button)
        val reset_button = findViewById<Button>(R.id.reset_button)
        val editText = findViewById<EditText>(R.id.editText)

        var secret: Int = Random.nextInt(10) + 1

        guess_button.setOnClickListener {
            val inputText = editText.text.toString()
            if (inputText.isNotEmpty()) {
                val validate_num: Int = inputText.toInt() - secret
                var ans_str: String = "恭喜!你猜對了!!!"
                if (validate_num > 0) {
                    ans_str = "你猜太大了!!"
                } else if (validate_num < 0) {
                    ans_str = "你猜小了，猜大一些~"
                }
                textView.text = ans_str
            } else {
                Toast.makeText(this, "請輸入數字", Toast.LENGTH_SHORT).show()
            }
        }

        reset_button.setOnClickListener {
            textView.text
        }
    }
}