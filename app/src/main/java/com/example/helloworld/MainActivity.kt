package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Welcome to Hello World Application")
        Log.d("MainActivity","Welcome to Hello World Application")

       var firstName ="Tahani"
        var secoundName = "Alnofaie"
if (firstName.length<7){
    println("welcome {$firstName}")
    Log.d("MainActivity ","\"welcome {$firstName}\"")
    }else{
        println("who are you? ")
    }
        var x=12;
        var y=3;
        var z=x+y;
        println(z)
        Log.d("MainActivity","${x} + ${y} =${z}")
}}