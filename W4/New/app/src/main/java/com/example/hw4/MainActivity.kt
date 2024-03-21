package com.example.hw4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var txtCom: TextView
    private lateinit var txtResult: TextView
    private lateinit var btnScissors: Button
    private lateinit var btnRock: Button
    private lateinit var btnPaper: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtCom = findViewById<TextView>(R.id.txtCom)
        txtResult = findViewById<TextView>(R.id.txtResult)
        btnScissors = findViewById<Button>(R.id.btnSicssors)
        btnRock = findViewById<Button>(R.id.btnRock)
        btnPaper = findViewById<Button>(R.id.btnPaper)

        //石頭
        btnRock.setOnClickListener {
            val iComplay = Random().nextInt( 3)+1
            when(iComplay){
                1-> {
                    txtCom.setText(R.string.scissors)
                    txtResult.setText(getString(R.string.win))
                }
                2-> {
                    txtCom.setText(R.string.rock)
                    txtResult.setText(getString(R.string.draw))
                }
                3-> {
                    txtCom.setText(R.string.paper)
                    txtResult.setText(getString(R.string.lose))
                }
            }
        }
        //剪刀
        btnScissors.setOnClickListener {
            val iComplay = Random().nextInt( 3)+1
            when(iComplay){
                1-> {
                    txtCom.setText(R.string.scissors)
                    txtResult.setText(getString(R.string.draw))
                }
                2-> {
                    txtCom.setText(R.string.rock)
                    txtResult.setText(getString(R.string.lose))
                }
                3-> {
                    txtCom.setText(R.string.paper)
                    txtResult.setText(getString(R.string.win))
                }
            }
        }
        //布
        btnPaper.setOnClickListener{
            val iComplay = Random().nextInt( 3)+1
            when(iComplay){
                1-> {
                    txtCom.setText(R.string.scissors)
                    txtResult.setText(getString(R.string.lose))
                }
                2-> {
                    txtCom.setText(R.string.rock)
                    txtResult.setText(getString(R.string.win))
                }
                3-> {
                    txtCom.setText(R.string.paper)
                    txtResult.setText(getString(R.string.draw))
                }
            }
        }

    }
}