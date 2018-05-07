package com.kuloglu.kotlinmvp.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.StaggeredGridLayoutManager
import com.kuloglu.kotlinmvp.AppDog
import com.kuloglu.kotlinmvp.R
import com.kuloglu.kotlinmvp.model.Data
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

    lateinit var adapter: AnimalAdapter
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenterImpl(this, application as AppDog)
        recyclerInit()
        presenter.create()
    }

    private fun recyclerInit(){
        adapter= AnimalAdapter()
        recycler_view.apply {
            layoutManager=StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
            setHasFixedSize(true)
        }
        recycler_view.adapter = adapter
    }

    override fun setList(list:List<Data>) {
        adapter.setList(list)
    }

}
