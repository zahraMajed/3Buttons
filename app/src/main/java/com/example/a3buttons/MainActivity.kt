package com.example.a3buttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var EdT1:EditText
    lateinit var EdT2:EditText
    lateinit var EdT3:EditText

    lateinit var btnToast:Button
    lateinit var btnTv:Button
    lateinit var btnGo:Button

    lateinit var textView:TextView
    lateinit var testList:ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EdT1=findViewById(R.id.edt1)
        EdT2=findViewById(R.id.edt2)
        EdT3=findViewById(R.id.edt3)

        btnToast=findViewById(R.id.btnToast)
        btnTv=findViewById(R.id.btnTV)
        btnGo=findViewById(R.id.btnGo)

        textView=findViewById(R.id.textView)
        testList= arrayListOf(EdT1.text.toString(),EdT2.text.toString(),EdT3.text.toString())

        btnToast.setOnClickListener(){
            Toast.makeText(applicationContext,"Hello from Toast", Toast.LENGTH_LONG).show()
        }

        btnTv.setOnClickListener(){
            textView.text="${EdT1.text} \n ${EdT2.text} \n ${EdT3.text}"
        }

        btnGo.setOnClickListener(){
            val msg="${EdT1.text} \n ${EdT2.text} \n ${EdT3.text}"
            intent= Intent(this, MainActivity2::class.java)
            intent.putExtra("text",msg)
            startActivity(intent)
        }
    }
}