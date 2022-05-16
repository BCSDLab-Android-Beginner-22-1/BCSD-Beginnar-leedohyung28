package com.example.assignement6_bcsd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assignement6_bcsd.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val data : MutableList<Member> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initialize()
        refreshRecyclerView()

        binding.button.setOnClickListener {
            val string = R.id.NewText.toString()
            data.add(Member(string))
            refreshRecyclerView()
        }

        binding.nameProfile.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("AlertDialog")
            builder.setMessage("삭제하시겠습니까?")
            builder.setPositiveButton("삭제") {
                dialog, which ->
                data.remove(Member(string))
                refreshRecyclerView()
            }
            builder.setNegativeButton("취소") {
                dialog, which ->
            }
        }

        binding.nameProfile.setOnLongClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("AlertDialog")
            builder.setMessage("삭제하시겠습니까?")
            builder.setPositiveButton("확인") {
                    dialog, which ->
                    data.remove(Member(string))
                    refreshRecyclerView()
            }
            builder.setNeutralButton("EditText") {
                dialog, which ->
            }
            builder.setNegativeButton("취소") {
                    dialog, which ->
            }
        }

    }

    private fun initialize(){
        with(data){
        }
    }

    private fun refreshRecyclerView(){
        val adapter = MainAdapter()
        adapter.listData = data
        binding.nameProfile.adapter = adapter
        binding.nameProfile.layoutManager = LinearLayoutManager(this)
    }

}