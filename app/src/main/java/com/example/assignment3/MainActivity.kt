package com.example.assignment3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonNavigate: Button = findViewById(R.id.buttonNavigate)

        buttonNavigate.setOnClickListener {
            // Passing data to SecondActivity
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("string1", getString(R.string.label_one))
            intent.putExtra("string2", getString(R.string.label_two))
            intent.putExtra("string3", getString(R.string.label_three))
            intent.putExtra("string4", getString(R.string.label_four))
            intent.putExtra("string5", getString(R.string.label_five))
            intent.putExtra("booleanValue", true)
            intent.putExtra("intValue", 42)
            intent.putExtra("floatValue", 3.14f)
            startActivity(intent)
        }
    }
}

