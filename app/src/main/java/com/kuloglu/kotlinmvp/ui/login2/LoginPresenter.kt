package com.kuloglu.kotlinmvp.ui.login2

class LoginPresenter(val login2View: Login2View) {
    fun login(username: String, password: String) {
        if(username=="2")
        {
            login2View.onSuccess()
        }
        else
        {
            val msg="Kullanıcı adı veya parola yanlış"
            login2View.onFailure(msg)
        }
    }


}