package com.example.text

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sentActivity = findViewById<Button>(R.id.sent)
        val tel = findViewById<TextView>(R.id.telText)
        val oldpeople = findViewById<Spinner>(R.id.oldspinner)
        val kidpeople = findViewById<Spinner>(R.id.kidspinner)
        val C1 = findViewById<CheckBox>(R.id.chair)
        val C2 = findViewById<CheckBox>(R.id.spoon)

        //下拉選單
        val adapter = ArrayAdapter.createFromResource( this, R.array.people,
        android.R.layout.simple_spinner_dropdown_item)
        oldpeople.adapter = adapter
        kidpeople.adapter = adapter

        oldpeople.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>, view: View,pos:Int,id:Long){
                val people = resources.getStringArray(R.array.people)

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }



        //送出
        sentActivity.setOnClickListener{

            var bundle =Bundle()
            var textView = tel.text.toString()
            var text2 = oldpeople.selectedItem.toString()
            var text22 = kidpeople.selectedItem.toString()
            var Str = "需要"
            if (C1.isChecked()){
                Str = Str+C1.getText().toString()
            }
            if (C2.isChecked()){
                Str = Str + "、" + C2.getText().toString()
            }



            bundle.putString("textView",textView )
            bundle.putString("text2",text2)
            bundle.putString("text22",text22)
            bundle.putString("Str",Str)




            var M2Intent = Intent( this,MainActivity2::class.java)
            M2Intent.putExtra( "key",bundle)
            startActivity(M2Intent)//轉跳下一頁
        }

    }

 }
