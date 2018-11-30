package com.example.ronald.examen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class Pantalla2Activity : AppCompatActivity() {
    private lateinit var recycleview : RecyclerView
    private  lateinit var viewAdapter : RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla2)
        viewManager = LinearLayoutManager(this)
        viewAdapter = 
    }
}
