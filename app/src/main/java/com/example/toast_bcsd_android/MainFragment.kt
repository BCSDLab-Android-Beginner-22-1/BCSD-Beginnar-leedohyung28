package com.example.toast_bcsd_android

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
/*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val num1 = arguments?.getInt("num1")
        val counter = (0..num1!!).random()
        //val text_briefing = view.findViewById<TextView>(R.id.text_briefing)
        //val text_count = view.findViewById<TextView>(R.id.text_count)
        text_briefing.text = "Here is a random number between 0 and $counter"
        text_count.text = "$counter"
}
*/
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val num1 = arguments?.getInt("num1")
        val counter = (0..num1!!).random()
        val text_briefing = view.findViewById<TextView>(R.id.text_briefing)
        val text_count = view.findViewById<TextView>(R.id.text_count)
        text_briefing.text = "Here is a random number between 0 and $counter"
        text_count.text = "$counter"

    }


}