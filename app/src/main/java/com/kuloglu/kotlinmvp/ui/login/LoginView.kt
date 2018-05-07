package com.kuloglu.kotlinmvp.ui.login

interface LoginView {
    fun loginProgressStarted()

    fun loginProgressFinished()

    fun showErrorMessage(message:String)

    fun goToMain()
}