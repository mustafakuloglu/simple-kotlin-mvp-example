package com.kuloglu.kotlinmvp.ui.login

import android.R.attr.password
import android.os.Handler
import android.text.TextUtils



class LoginPresenterImpl(private var view: LoginView): LoginPresenter {

    override fun login(username: String, password: String) {
        view.loginProgressStarted()
        Handler().postDelayed(Runnable {
            if (username!="1"&&password!="2") {
                view.showErrorMessage("there is an error")
                view.loginProgressFinished()
                return@Runnable
            }
            view.loginProgressFinished()
            view.goToMain()
        }, 2000)

    }
    override fun onDestroy() {

    }
}