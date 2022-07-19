package com.example.tempconvert

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var temp_input : EditText
    private lateinit var temp_output : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val c_to_f_button = findViewById<Button>(R.id.c_to_f_button)
        val f_to_c_button = findViewById<Button>(R.id.f_to_c_button)

        temp_input = findViewById<EditText>(R.id.temp_input)
        temp_output = findViewById<TextView>(R.id.temp_output)

        c_to_f_button.setOnClickListener { convertCtoF() }
        f_to_c_button.setOnClickListener { convertFtoC() }
    }

    private fun convertCtoF() {
        try {
            val c_temp = temp_input.text.toString().toFloat()
            val f_temp = (c_temp * 9.0f / 5.0f) + 32.0f
            temp_output.text = "$f_temp F"
        } catch (e : Exception) {
            Toast.makeText(this, "Invalid Input!", Toast.LENGTH_LONG).show()
        }
    }
    private fun convertFtoC() {
        try {
            val f_temp = temp_input.text.toString().toFloat()
            val c_temp = (f_temp - 32.0f) * (5.0f / 9.0f)
            temp_output.text = "$c_temp C"
        } catch (e : Exception) {
            Toast.makeText(this, "Invalid Input!", Toast.LENGTH_LONG).show()
        }
    }
}