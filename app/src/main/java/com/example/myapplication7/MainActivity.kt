package com.example.myapplication7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var newOperator = true
    var edit: EditText? = null
    var setNumber = ""
    var operator = "+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun numberEnter(view: View) {
        if(newOperator) editText.setText("")
        newOperator = false
        var number: String = editText.text.toString()
        if(view.id == btnOne.id){
            number += "1"
        }
        else if (view.id === btnTwo.id) {
            number += "2"
        }
        else if (view.id === btnThree.id) {
            number += "3"
        }
        else if (view.id === btnFour.id) {
            number += "4"
        }
        else if (view.id === btnFive.id) {
            number += "5"
        }
        else if (view.id === btnSix.id) {
            number += "6"
        }
        else if (view.id === btnSeven.id) {
            number += "7"
        }
        else if (view.id === btnHeight.id) {
            number += "8"
        }
        else if (view.id === btnNine.id) {
            number += "9"
        }
        else if (view.id === btnZero.id) {
            number += "0"
        }
        else if (view.id === btnDot.id) {
            number += "."
        }
        editText.setText(number)
    }

    fun operatorEnter(view: View){
        newOperator = true
        setNumber = editText.text.toString()
        if (view.id === btnMultiply.id) {
            operator = "*"
        }
        else if (view.id === btnMoins.id) {
            operator = "-"
        }
        else if (view.id === btnDivision.id) {
            operator = "/"
        }
        else if (view.id === btnPlus.id) {
            operator = "+"
        }
    }

    fun result(view: View?) {
        val newNumber: String = editText.text.toString()
        var output = 0.0
        if (operator === "+") output = setNumber.toDouble() + newNumber.toDouble()
        if (operator === "-") output = setNumber.toDouble() - newNumber.toDouble()
        if (operator === "/") output = setNumber.toDouble() / newNumber.toDouble()
        if (operator === "*") output = setNumber.toDouble() * newNumber.toDouble()
        editText.setText(output.toString() + "")
    }

    fun clear(view: View?) {
        editText.setText("0")
        newOperator = true
    }
}