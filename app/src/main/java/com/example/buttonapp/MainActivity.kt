
package com.example.buttonapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var number : Int = 0
    lateinit var tview : TextView
    lateinit var plus : Button
    lateinit var minus : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tview = findViewById(R.id.tv)
        plus = findViewById(R.id.btn1)
        minus = findViewById(R.id.btn2)

        plus.setOnClickListener {
            Plus(add = true)
            tview.text = "$number"
        }

        minus.setOnClickListener {
            Plus(add = false)
            tview.text = "$number"
        }

    }
    private fun Plus(add: Boolean) {
        if (add){
            number++
            ChangeColor()
        }else{
            number--
            ChangeColor()
        }
    }
    fun ChangeColor(){

       if (number == 0){
            tview.setTextColor(Color.GRAY)

        }
        if (number > 0){
            tview.setTextColor(Color.BLACK)
        }
        if (number < 0){
           tview.setTextColor(Color.RED)
        }
   }

}



