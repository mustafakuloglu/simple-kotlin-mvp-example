package com.kuloglu.kotlinmvp.ui.login

interface LoginPresenter {
    fun login(username:String,password:String)


    /***
     *  onDestroy() methodu viewin onDestroy() methoduna bağlanmalı.
     *  Bu method içerisinde view ölürken presenter tüm bağımlılıklardan kurtulamslı.
     */
    fun onDestroy()
}