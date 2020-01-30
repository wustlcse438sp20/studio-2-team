package com.example.studio2

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val CHANGE_ACTIVITY_REQUEST = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun changeActivity(view: View){
        val changeActivityIntent = Intent(this,ChangeActivity::class.java)
        startActivityForResult(changeActivityIntent,CHANGE_ACTIVITY_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == CHANGE_ACTIVITY_REQUEST){
            if(resultCode == Activity.RESULT_OK){

            }
        }
    }
}
