package com.kim.listviewpractice_kim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kim.listviewpractice_kim.datas.Student

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(Student("김준휘","1984"))
        mStudentList.add(Student("박수연","1985"))
        mStudentList.add(Student("김지율","2019"))
        mStudentList.add(Student("김준형","1990"))
        mStudentList.add(Student("김낙관","1956"))
        mStudentList.add(Student("최연희","1957"))
    }
}