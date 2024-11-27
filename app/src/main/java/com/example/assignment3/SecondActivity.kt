package com.example.assignment3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val textViewData: TextView = findViewById(R.id.textViewData)
        val buttonNext: Button = findViewById(R.id.buttonNext)

        // Retrieve data from intent
        val string1 = intent.getStringExtra("string1")
        val string2 = intent.getStringExtra("string2")
        val string3 = intent.getStringExtra("string3")
        val string4 = intent.getStringExtra("string4")
        val string5 = intent.getStringExtra("string5")
        val booleanValue = intent.getBooleanExtra("booleanValue", false)
        val intValue = intent.getIntExtra("intValue", 0)
        val floatValue = intent.getFloatExtra("floatValue", 0.0f)

        // Combine data into one string
        val data = """
            $string1
            $string2
            $string3
            $string4
            $string5
            Boolean: $booleanValue
            Integer: $intValue
            Float: $floatValue
        """.trimIndent()

        textViewData.text = data
        Log.d("SecondActivity", data)

        buttonNext.setOnClickListener {
            val finalData = "Final Data: $data"
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("finalData", finalData)
            startActivity(intent)
        }
    }
}

