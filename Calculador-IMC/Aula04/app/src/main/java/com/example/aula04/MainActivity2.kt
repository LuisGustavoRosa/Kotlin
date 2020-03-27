package com.example.aula04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*
import java.math.RoundingMode

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val imc=intent.getParcelableExtra<Imc>("IMC")
        val imcdapessoa=imc.peso/(imc.altura*imc.altura)
        val imcdapessoaa=imcdapessoa.toBigDecimal().setScale(1, RoundingMode.UP).toDouble()
        textParcelable.text=imcdapessoaa.toString()
    }



}

