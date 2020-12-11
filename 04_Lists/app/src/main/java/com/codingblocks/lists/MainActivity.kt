package com.codingblocks.lists

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item_course.view.*

class MainActivity : AppCompatActivity() {

    private val courses = listOf<Course>(
        Course("Android", "Arnav", 20, 14999),
        Course("NodeJS", "Arnav", 25, 16999),
        Course("Recursion", "Rishab", 10, 9999),
        Course("Dynamic Programming", "Prateek", 15, 12999),
        Course("Java Basics", "Garima", 10, 6999),
        Course("C++ Basics", "Pranav", 10, 6999),
        Course("Kotlin", "Pulkit", 7, 999),
        Course("Javascript", "Sanjeet", 8, 1299),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lvCourses.adapter = object : BaseAdapter() {
            override fun getCount() = courses.size
            override fun getItem(position: Int): Course = courses[position]

            override fun getItemId(position: Int): Long = getItem(position).hashCode().toLong()

            override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
                val itemView = layoutInflater.inflate(R.layout.list_item_course, parent, false)
                val course = getItem(position)
                itemView.tvCourseName.text = course.name
                itemView.tvTeacherName.text = course.teacher
                itemView.tvCourseDetails.text = "Lectures ${course.lectures} | Fees: INR ${course.fees}"
                return itemView
            }

        }
        lvCourses.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, "Clicked on ${courses[position]}", Toast.LENGTH_SHORT).show()
        }

    }
}