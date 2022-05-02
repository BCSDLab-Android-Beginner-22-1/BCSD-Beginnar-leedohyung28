package com.example.toast_bcsd_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_toast.setOnClickListener {
            Toast.makeText(this@MainActivity, "Toast Message", Toast.LENGTH_SHORT).show()
        }

        var counter : Int = 0;

        button_count.setOnClickListener {
            counter++
            text_count.text = "$counter"
        }

        button_random.setOnClickListener {
            counter = (0..counter).random()
            text_briefing.text = "Here is a random number between 0 and $counter"
            text_count2.text = "$counter"
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }

}