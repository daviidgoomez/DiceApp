package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var rollButton: Button
    private lateinit var resultadoTexto: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
        initListener()
    }

    private fun initComponents() {
        rollButton = findViewById(R.id.boton)
        resultadoTexto = findViewById(R.id.texto)
    }

    private fun initListener() {
        rollButton.setOnClickListener { rollDice()}
    }



    private fun rollDice(){
        val dice = Dice(6)
        val diceRoll = dice.roll()

        resultadoTexto.text = diceRoll.toString()
    }



    class Dice(private val numSides:Int) {
        fun roll():Int {
            return (1 ..numSides).random()
        }
    }





}