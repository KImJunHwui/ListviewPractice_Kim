package com.kim.listviewpractice_kim.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.kim.listviewpractice_kim.datas.Student

class StudentAdaptor(
    val mContext : Context,
    val resId : Int,
    val mlist : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mlist) {
}