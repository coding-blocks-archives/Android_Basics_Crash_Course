package com.codingblocks.uiinteractions

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            val var1 = etVar1.text.toString().toInt()
            val var2 = etVar2.text.toString().toInt()

            val result = (var1 + var2).toString()

            tvResult.text = result
        }
    }
}