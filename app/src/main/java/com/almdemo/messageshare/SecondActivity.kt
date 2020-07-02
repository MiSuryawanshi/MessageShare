package com.almdemo.messageshare

import android.app.AppComponentFactory
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_second)

        //Extracting values coming from another activity
        val bundle: Bundle? = intent.extras    //there is not a concept of getters and setters.



        val msg = bundle!!.getString("user_message")
        //Log.i("Second_Activity", msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        //Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

        txvUserMessage.text = msg
       // txvUserMessage.text =  msg

    }
}