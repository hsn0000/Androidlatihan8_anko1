package com.example.andoidlatihan8_anko1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.loginafter.*

class AfterClass : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginafter)
        val  ambilData = intent.getStringExtra("nama")
        tv_afterClas.text = ambilData
    }
}