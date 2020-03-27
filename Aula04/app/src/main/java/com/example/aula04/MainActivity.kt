package com.example.aula04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnParcelable.setOnClickListener(View.OnClickListener {
            val imc =Imc(altura.text.toString().toDouble(),peso.text.toString().toDouble())
            val intent= Intent(this,MainActivity2::class.java)
            intent.putExtra("IMC",imc)
            startActivity(intent)
        })





        val spinner: Spinner = findViewById(R.id.Sexo)

        ArrayAdapter.createFromResource(
            this,
            R.array.Sexo,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
    }

    fun sendIMC(){

    }
}
