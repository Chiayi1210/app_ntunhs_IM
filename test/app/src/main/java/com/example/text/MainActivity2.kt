package com.example.text

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //返回
        val back = findViewById<Button>(R.id.Back)
        val txt = findViewById<TextView>(R.id.textView)
        val txt2 = findViewById<TextView>(R.id.textView2)
        val txt3 = findViewById<TextView>(R.id.textView3)
        val text = intent.getBundleExtra("key")?.getString("textView").toString()
        val text2 = intent.getBundleExtra("key")?.getString("text2").toString()
        val text22 = intent.getBundleExtra("key")?.getString("text22").toString()
        val Str = intent.getBundleExtra("key")?.getString("Str").toString()


        txt.setText("訂位電話:"+text)
        txt2.setText("訂位人數:"+text2+"大"+text22+"小")
        txt3.setText(Str)


        back.setOnClickListener{
            finish()
            var M1Intent = Intent( this,MainActivity::class.java)
            startActivity(M1Intent)
        }
    }
}