package com.team.villevich.testapp

import android.app.Fragment
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)

        /*var txtView: TextView = findViewById<TextView>(R.id.textView)
        txtView.text="testApp"*/

        this.textView.text = "Kotlin"
    }

    fun btnClick(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }


}
