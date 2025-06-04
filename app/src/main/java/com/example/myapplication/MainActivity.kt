package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextInput = findViewById<EditText>(R.id.editTextInput)
        val textViewOutput = findViewById<TextView>(R.id.textViewOutput)
        val buttonCopy = findViewById<Button>(R.id.buttonCopy)
        val buttonClose = findViewById<Button>(R.id.buttonClose)

        buttonCopy.setOnClickListener {
            val inputText = editTextInput.text.toString()
            textViewOutput.text = inputText
        }

        buttonClose.setOnClickListener {
            finishAffinity()
        }
    }
}
