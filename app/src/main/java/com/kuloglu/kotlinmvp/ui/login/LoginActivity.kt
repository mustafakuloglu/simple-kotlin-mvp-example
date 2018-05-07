package com.kuloglu.kotlinmvp.ui.login

import android.app.ProgressDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.kuloglu.kotlinmvp.ui.main.MainActivity
import com.kuloglu.kotlinmvp.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), LoginView, View.OnClickListener {
    lateinit var dialog:ProgressDialog
    lateinit var presenter: LoginPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login.setOnClickListener(this)
        presenter = LoginPresenterImpl(this)
        dialog= ProgressDialog(this)
    }
    override fun loginProgressStarted() {
        dialog.setMessage(getString(R.string.checking_info))
        dialog.show()

    }

    override fun loginProgressFinished() {
        dialog.dismiss()
    }

    override fun showErrorMessage(message:String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun goToMain() {
        startActivity(Intent(this, MainActivity::class.java))
    }

    override fun onClick(v: View?) {
        presenter.login(username = userName.text.toString(),password = password.text.toString())
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }


}
