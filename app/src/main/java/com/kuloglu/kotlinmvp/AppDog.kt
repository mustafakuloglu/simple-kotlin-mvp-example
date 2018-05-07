package com.kuloglu.kotlinmvp

import android.app.Application
import com.kuloglu.kotlinmvp.di.component.ApplicationComponent
import com.kuloglu.kotlinmvp.di.component.DaggerApplicationComponent
import com.kuloglu.kotlinmvp.di.module.NetModule
import dagger.android.DaggerApplication

class AppDog: Application() {
    val component : ApplicationComponent by lazy {
        DaggerApplicationComponent
                .builder()
                .netModule(NetModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}