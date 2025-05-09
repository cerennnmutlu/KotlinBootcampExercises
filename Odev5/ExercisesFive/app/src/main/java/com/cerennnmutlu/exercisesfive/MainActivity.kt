package com.cerennnmutlu.exercisesfive

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    private lateinit var display: TextView
    private var currentNumber: String = ""
    private var total: Double = 0.0
    private var lastOperation: String = ""
    private var isNewOperation: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display = findViewById(R.id.display)
        updateDisplay("0")
    }

    fun onDigitClick(view: View) {
        if (view is Button) {
            val digit = view.text.toString()

            if (isNewOperation) {
                currentNumber = digit
                isNewOperation = false
            } else {
                currentNumber += digit
            }

            updateDisplay(currentNumber)
        }
    }

    fun onOperationClick(view: View) {
        if (view is Button) {
            if (currentNumber.isNotEmpty()) {
                performCalculation()
            }
            lastOperation = view.text.toString()
            isNewOperation = true
        }
    }

    fun onEqualsClick(view: View) {
        if (currentNumber.isNotEmpty() && lastOperation.isNotEmpty()) {
            performCalculation()
            lastOperation = ""
            isNewOperation = true
        }
    }

    fun onClearClick(view: View) {
        currentNumber = ""
        total = 0.0
        lastOperation = ""
        isNewOperation = true
        updateDisplay("0")
    }

    private fun performCalculation() {
        val number = currentNumber.toDouble()
        when (lastOperation) {
            "+" -> total += number
            else -> total = number // İlk sayı için
        }
        currentNumber = ""
        updateDisplay(total.toString())
    }

    private fun updateDisplay(value: String) {
        // Eğer sayı tam sayı ise .0 kısmını gösterme
        val displayValue = if (value.contains(".0")) {
            value.substring(0, value.length - 2)
        } else {
            value
        }
        display.text = displayValue
    }
}