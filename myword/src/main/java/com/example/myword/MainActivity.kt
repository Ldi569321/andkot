package com.example.myword

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = getWord();
    }

    private fun getWord(): String {
        val list1 = listOf(
            "I", "E"
        )
        val list2 = listOf(
            "S", "N"
        )
        val list3 = listOf(
            "T", "F"
        )
        val list4 = listOf(
            "J", "P"
        )
        return "오늘은 ${list1.random()}${list2.random()}${list3.random()}${list4.random()}처럼 살아보자"
    }

}
