package com.kim.listviewpractice_kim.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.kim.listviewpractice_kim.R
import com.kim.listviewpractice_kim.datas.Student

class StudentAdaptor(
    val mContext : Context,
    val resId : Int,
    val mlist : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mlist) {

        val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null){

            tempRow = inf.inflate(R.layout.student_list_item, null)

        }
        val row = tempRow!!

        val studentData = mlist[position]


        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val birthYearTxt = row.findViewById<TextView>(R.id.birthYearTxt)

        nameTxt.text = studentData.name

//        출생연도를 가지고 -> 2021년식 한국 나이로 보여주기.

        birthYearTxt.text = "(${studentData.getMyAgeIn2021()}세)"


        return row
    }
}