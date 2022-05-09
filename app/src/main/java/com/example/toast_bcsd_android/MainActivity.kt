package com.example.toast_bcsd_android

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var counter : Int = 0;

        button_toast.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("AlertDialog 타이틀 입니다.")
            builder.setMessage("AlertDialog")
            builder.setPositiveButton("초기화") {
                    dialog, which ->
                    counter = 0
                    text_count.text = "$counter"
                }
            builder.setNegativeButton("종료") { dialog, which ->
                }
            builder.setNeutralButton("메시지") {
                    dialog, which ->
                    Toast.makeText(this,"Toast 메시지 입니다.", Toast.LENGTH_SHORT).show()
                }
            builder.show()
        }

        button_count.setOnClickListener {
            counter++
            text_count.text = "$counter"
        }

        button_random.setOnClickListener {
            val fragment1 = MainFragment()
            val bundle = Bundle()
            bundle.putInt("num1",counter)
            fragment1.arguments = bundle
            supportFragmentManager.beginTransaction()
                .replace(R.id.frame, fragment1)
                .commit()
        }
    }

}