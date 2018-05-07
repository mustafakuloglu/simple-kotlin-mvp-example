package com.kuloglu.kotlinmvp.ui.login2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kuloglu.kotlinmvp.R
import com.kuloglu.kotlinmvp.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_login2.*

class Login2Activity : AppCompatActivity(),Login2View {
    val presenter= LoginPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        login.setOnClickListener{
            presenter.login(userName.text.toString(),password.text.toString())
        }

    }

    override fun onSuccess() {
        startActivity(Intent(this, MainActivity::class.java))

    }

    override fun onFailure(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}
