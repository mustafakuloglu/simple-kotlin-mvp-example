package com.kuloglu.kotlinmvp.di.component

import android.content.Context
import com.kuloglu.kotlinmvp.AppDog
import com.kuloglu.kotlinmvp.di.module.NetModule
import com.kuloglu.kotlinmvp.ui.main.MainPresenterImpl
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [(NetModule::class)])
interface ApplicationComponent {

    fun a(): AppDog
    fun context(): Context

    fun inject(appAnime: AppDog)

    fun inject(appAnime: MainPresenterImpl)

}