package com.codingblocks.uiinteractions

import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            val var1: Int
            val var2: Int

            try {
                var1 = etVar1.text.toString().toInt()
                var2 = etVar2.text.toString().toInt()
            } catch (e: NumberFormatException) {
                AlertDialog.Builder(this)
                        .setTitle("Invalid Operation")
                        .setMessage("Please enter both numbers to calculate")
                        .setPositiveButton("OK") { dialog, _ -> dialog.dismiss() }
                        .setCancelable(false)
                        .show()


                return@setOnClickListener
            }

            val result = (var1 + var2).toString()

            tvResult.text = result
        }
    }
}