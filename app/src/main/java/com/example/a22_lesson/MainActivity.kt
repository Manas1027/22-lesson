package com.example.a22_lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnA.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, FragmentA()).commit()
        }
        btnB.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, FragmentB()).commit()
        }
    }

}