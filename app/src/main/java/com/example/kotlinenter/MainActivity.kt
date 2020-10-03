package com.example.kotlinenter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {

    private var model: MyViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        model = ViewModelProvider(this).get(MyViewModel::class.java)
        initGui(model!!)
    }

    private fun initGui(model: MyViewModel) {
        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        model.stateGui.observe(this, { stateGui ->
            textView.text = stateGui.text
            button.isEnabled = stateGui.isButton
        })
        button.setOnClickListener {
            model.buttonClick(resources.getString(R.string.text))
        }
    }
}