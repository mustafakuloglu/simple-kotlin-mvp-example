package com.kuloglu.kotlinmvp.ui.main

import android.util.Log
import com.kuloglu.kotlinmvp.AppDog
import com.kuloglu.kotlinmvp.api.DogApi
import com.kuloglu.kotlinmvp.model.Animal
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject




class MainPresenterImpl(val view: MainView, app:AppDog): MainPresenter,Callback<Animal>
{
    @Inject
    lateinit var api:DogApi
    init {
        app.component.inject(this)
    }

    override fun create() {
        api.listRepo(40).enqueue(this)

    }

    override fun onFailure(call: Call<Animal>?, t: Throwable?) {
        Log.d("ss","asd")
    }

    override fun onResponse(call: Call<Animal>?, response: Response<Animal>) {
            val animal = response.body()
        if (animal?.response_code==200)
            animal.data?.let { view.setList(it) }

    }


}
