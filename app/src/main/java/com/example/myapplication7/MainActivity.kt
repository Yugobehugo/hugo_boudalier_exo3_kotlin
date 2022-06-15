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
        if(view.id == buttonOne.id){
            number += "1"
        }
        else if (view.id === buttonTwo.id) {
            number += "2"
        }
        else if (view.id === buttonThree.id) {
            number += "3"
        }
        else if (view.id === buttonFour.id) {
            number += "4"
        }
        else if (view.id === buttonFive.id) {
            number += "5"
        }
        else if (view.id === buttonSix.id) {
            number += "6"
        }
        else if (view.id === buttonSeven.id) {
            number += "7"
        }
        else if (view.id === buttonHeight.id) {
            number += "8"
        }
        else if (view.id === buttonNine.id) {
            number += "9"
        }
        else if (view.id === buttonZero.id) {
            number += "0"
        }
        else if (view.id === buttonDot.id) {
            number += "."
        }
        editText.setText(number)
    }

    fun operatorEnter(view: View){
        newOperator = true
        setNumber = editText.text.toString()
        if (view.id === buttonMultiply.id) {
            operator = "*"
        }
        else if (view.id === buttonMoins.id) {
            operator = "-"
        }
        else if (view.id === buttonDivision.id) {
            operator = "/"
        }
        else if (view.id === buttonPlus.id) {
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