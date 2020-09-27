package com.codingblocks.lists

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val courses = listOf(
            "Android", "NodeJS", "Django",
            "Competitive Programming", "Dynamic Programming",
            "C++", "Java", "Data Structures",
            "Interview Prep", "React", "VueJS",
            "FAANG Interview", "Machine Learning",
            "Data Science", "Natural Language Processing",
            "Kotlin Basics"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lvCourses.adapter = ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                courses
        )
        lvCourses.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, "Clicked on ${courses[position]}", Toast.LENGTH_SHORT).show()
        }

    }
}