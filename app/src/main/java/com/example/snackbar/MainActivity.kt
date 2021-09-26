package com.example.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
     private lateinit var lcoot : ConstraintLayout
     private lateinit var mytext : EditText
     private lateinit var butt : Button
     private lateinit var textlist1 : ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lcoot = findViewById(R.id.lee)
         textlist1 = ArrayList()


        mytext = findViewById(R.id.editTextmain)

         butt = findViewById(R.id.buttonmain)

        butt.setOnClickListener { run() }



        val myRv = findViewById<RecyclerView>(R.id.rvMain)

        myRv.adapter = RecyclerViewAdapter(this,textlist1)

        myRv.layoutManager =LinearLayoutManager(this)


        }
        private fun run(){

            val msg = mytext.text.toString()
            if(msg.isNotEmpty()){
                textlist1.add(msg)
                mytext.text.clear()
                mytext.clearFocus()
            }else {
                Snackbar.make(lcoot, "enter text", Snackbar.LENGTH_LONG).show()

            }
    }
}