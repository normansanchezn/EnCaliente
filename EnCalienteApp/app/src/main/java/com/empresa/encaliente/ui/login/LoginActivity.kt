package com.empresa.encaliente.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.empresa.encaliente.R
import com.empresa.encaliente.ui.register.RegisterActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setListeners()
    }

    private fun setListeners(){
        tvSingUp.setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}