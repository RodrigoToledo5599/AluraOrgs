package com.example.orgs

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text


class MainActivity : Activity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val view = TextView(this)
        view.setText("VAI TOMAR NU CU ")
        setContentView(R.layout.activity_main)
    }

}