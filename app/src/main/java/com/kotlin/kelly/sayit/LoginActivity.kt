package com.kotlin.kelly.sayit

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun login(view : View){

    }

    fun signup(view : View){
        val registerIntent = Intent(this,RegisterActivity::class.java)
        startActivity(registerIntent)

    }
}
