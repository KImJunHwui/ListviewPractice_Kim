package com.kim.listviewpractice_kim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kim.listviewpractice_kim.adapters.StudentAdaptor
import com.kim.listviewpractice_kim.datas.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    lateinit var mAdapter : StudentAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(Student("김준휘",1984))
        mStudentList.add(Student("박수연",1985))
        mStudentList.add(Student("김지율",2019))
        mStudentList.add(Student("김준형",1990))
        mStudentList.add(Student("김낙관",1956))
        mStudentList.add(Student("최연희",1957))

        mAdapter = StudentAdaptor(this, R.layout.student_list_item, mStudentList)

        studentListView.adapter = mAdapter

    }
}