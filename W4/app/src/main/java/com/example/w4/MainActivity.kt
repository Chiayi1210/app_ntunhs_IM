package com.example.w4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {
    val txtCom = findViewById<TextView>(R.id.txtCom)
    val txtResult = findViewById<TextView>(R.id.txtResult)
    val btnScissors = findViewById<Button>(R.id.btnSicssors)
    val btnRock = findViewById<Button>(R.id.btnRock)
    val btnPaper = findViewById<Button>(R.id.btnPaper)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
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
}