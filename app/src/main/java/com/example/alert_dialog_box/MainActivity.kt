package com.example.alert_dialog_box

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etMessage:EditText=findViewById(R.id.etMessage)
        var btDisplay:Button=findViewById(R.id.btDisplay)

        btDisplay.setOnClickListener{
            val alertDialog=AlertDialog.Builder(this)
                .setTitle("SAI")
                .setMessage(etMessage.text.toString())
                .setPositiveButton("ok"){dialog,which ->
                }
                .setNegativeButton("cancel"){dialog,which ->

                }
                .create()
            alertDialog.show()
        }


    }
}