package com.example.bdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bday_greet.*

class BdayGreetActivity : AppCompatActivity() {

    companion object{                          // companion obj is kinda static variables
        const val NAME_EXTRA ="name_extra"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bday_greet)
        val name = intent.getStringExtra(NAME_EXTRA)  // receiving the intent from main activity
        BdayGreeting.text="Happy Birthday\n $name !"
    }
}