package com.kim.listviewpractice_kim.datas

import android.util.Log


// 학생 하위정보 - 이름, 출생년도



class Student(
    val name : String,
    val birthYear: Int) {

    // 2011년 나이 나이를 결과로 보여주는 함수

    fun getMyAgeIn2021() : Int{

        val myAge = 2021-this.birthYear+1

        return myAge


    }


}