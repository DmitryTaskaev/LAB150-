package com.bignerdranch.android.lab11json

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class TaskInfo : AppCompatActivity() {

    private lateinit var myTask : Button
    private lateinit var addTask : Button

    private var JsonTxt : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_info)

        JsonTxt = intent.getStringExtra("json-str").toString()

        myTask = findViewById<Button>(R.id.myTaskBtn)
        addTask = findViewById(R.id.addTaskBtn)

        addTask.setOnClickListener {
            val reDir = Intent(this, MainActivity::class.java)
            startActivity(reDir)
        }
        myTask.setOnClickListener {
            Log.d("JSON-TXT", JsonTxt)
        }

    }
}