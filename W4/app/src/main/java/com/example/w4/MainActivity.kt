package com.example.w4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var txtCom: TextView
    private lateinit var txtResult:TextView
    private lateinit var btnScissors:Button
    private lateinit var btnRock:Button
    private lateinit var btnPaper:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtCom = findViewById<TextView>(R.id.txtCom)
        txtResult = findViewById<TextView>(R.id.txtResult)
        btnScissors = findViewById<Button>(R.id.btnSicssors)
        btnRock = findViewById<Button>(R.id.btnRock)
        btnPaper = findViewById<Button>(R.id.btnPaper)

    }

//石頭
    btnRock.setOnClickstener{
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
    btnScissors.setOnClickstener{
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
    btnPaper.setOnClickstener{
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