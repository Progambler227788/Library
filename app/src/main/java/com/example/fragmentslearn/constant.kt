package com.example.fragmentslearn

object Constant {
    private  lateinit var  rvArrayList: ArrayList<RvModel>
    fun getData() : ArrayList<RvModel>{
        rvArrayList = ArrayList ()
        rvArrayList.add(RvModel((R.drawable.bat),"Bat","This is babar azam bat"))
        rvArrayList.add(RvModel((R.drawable.cricket),"Cricket","This is sports"))
        rvArrayList.add(RvModel((R.drawable.calendar),"Calendar","This is calendar"))
        rvArrayList.add(RvModel((R.drawable.cricket),"Cricket","This is sports"))
        rvArrayList.add(RvModel((R.drawable.calendar),"Calendar","This is calendar"))
        rvArrayList.add(RvModel((R.drawable.cricket),"Cricket","This is sports"))
        rvArrayList.add(RvModel((R.drawable.calendar),"Calendar","This is calendar"))
        rvArrayList.add(RvModel((R.drawable.cricket),"Cricket","This is sports"))
        rvArrayList.add(RvModel((R.drawable.calendar),"Calendar","This is calendar"))
        rvArrayList.add(RvModel((R.drawable.cricket),"Cricket","This is sports"))
        rvArrayList.add(RvModel((R.drawable.calendar),"Calendar","This is calendar"))
        rvArrayList.add(RvModel((R.drawable.cricket),"Cricket","This is sports"))
        rvArrayList.add(RvModel((R.drawable.calendar),"Calendar","This is calendar"))

        return  rvArrayList

    }
}