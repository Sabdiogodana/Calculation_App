package com.sabdio.calculationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class CalculationActivity : AppCompatActivity() {
    lateinit var tilNum1: TextInputLayout
    lateinit var etNum1: TextInputEditText
    lateinit var tilNum2: TextInputLayout
    lateinit var etNum2: TextInputEditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnModulus: Button
    lateinit var btnDivision: Button
    lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculation)
        findviews()

        btnAdd.setOnClickListener {
            val intent=Intent(this,CalculationActivity::class.java)
            startActivity(intent)
            validation()
        }
        btnSubtract.setOnClickListener {
            val intent=Intent(this,CalculationActivity::class.java)
            startActivity(intent)
            validation()
        }
        btnModulus.setOnClickListener {
            val intent=Intent(this,CalculationActivity::class.java)
            startActivity(intent)
            validation()
        }
        btnDivision.setOnClickListener {
            val intent=Intent(this,CalculationActivity::class.java)
            startActivity(intent)
            validation()
        }
        btnAdd.setOnClickListener {
            var one = etNum1.text.toString().toInt()
            var two = etNum2.text.toString().toInt()
            addition(one, two)
        }
        btnSubtract.setOnClickListener {
            var one = etNum1.text.toString().toInt()
            var two = etNum2.text.toString().toInt()
            subtract(one, two)

        }
        btnModulus.setOnClickListener {
            var one = etNum1.text.toString().toInt()
            var two = etNum2.text.toString().toInt()
            modulus(one, two)
        }
        btnDivision.setOnClickListener {
            var one = etNum1.text.toString().toInt()
            var two = etNum2.text.toString().toInt()
            division(one, two)
        }
    }

    fun findviews() {
        tilNum1 = findViewById(R.id.tilNum1)
        etNum1 = findViewById(R.id.etNum1)
        tilNum2 = findViewById(R.id.tilNum2)
        etNum2 = findViewById(R.id.etNum2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnModulus = findViewById(R.id.btnModulus)
        btnDivision = findViewById(R.id.btnDivision)
        tvResult = findViewById(R.id.tvResult)
//
    }
    fun validation(){
        var error=false
        tilNum1.error=null
        tilNum2.error=null
        var one=etNum1.text.toString()
        if (one.isBlank()){
            tilNum1.error="First number required"
        }
        var two=etNum2.text.toString()
        if (two.isBlank()){
            tilNum2.error="Second number required"
        }
        if (!error){

        }
    }

    fun addition(one: Int, two: Int) {
        var sum = one+two
        tvResult.text=sum.toString()
    }
    fun subtract(one: Int, two: Int) {
        var sub = one-two
        tvResult.text=sub.toString()
    }
    fun modulus(one: Int, two: Int) {
        var module = one%two
        tvResult.text=module.toString()
    }
    fun division(one: Int, two: Int) {
        var div = one/two
        tvResult.text=div.toString()
    }
}
