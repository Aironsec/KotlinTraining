package com.example.kotlinenter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {
    private var model: MyViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        model = ViewModelProviders.of(this).get(MyViewModel::class.java)
        initGui()
    }

    private fun initGui() {
        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        model!!.stateGui.observe(this, { stateGui ->
            textView.text = stateGui.text
            button.isEnabled = stateGui.isButton
        })
        button.setOnClickListener {
            val stateGui = StateGui()
            stateGui.isButton = false
            stateGui.text = resources.getString(R.string.text)
            model!!.setStateGui(stateGui)
        }
    }
}