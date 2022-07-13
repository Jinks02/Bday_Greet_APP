package com.example.bdayapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun CreateCard(view: View) {
        val name = editTextTextPersonName.editableText.toString()
//        Toast.makeText(this,"name is $name",Toast.LENGTH_LONG).show()
        val intent = Intent(this,BdayGreetActivity::class.java)       // intent used to navigate from one process to another, here process is activity
        intent.putExtra(BdayGreetActivity.NAME_EXTRA,name) // passing name to intent to pass name from main activity to bdaygreet activity
        startActivity(intent)
    }



}