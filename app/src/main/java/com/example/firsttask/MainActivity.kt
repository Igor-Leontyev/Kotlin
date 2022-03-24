package com.example.firsttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOne:Button = findViewById(R.id.btnOne)
        var tvChange:TextView = findViewById(R.id.tv_cgange)



        btnOne.setOnClickListener(){
          tvChange.text = FirstDataClass().name +" "+ FirstDataClass().lengthName
            Cicle()
        }
    }
}

data class FirstDataClass(
    val name:String = "First Data Class",
    val lengthName:Int = name.length)

fun Cicle (){
    for(i in 1..40){
        println(i)
    }
}

