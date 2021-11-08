package com.zouarfatima.instagramkids

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()


        btm.setOnClickListener {
            val user_name = edt_user.text.toString()
            val passworld = edt_psw.text.toString()

            if (user_name.isEmpty()) {
                edt_user.error = "user name  Required"
                return@setOnClickListener


            }
            if (passworld.isEmpty()) {
                edt_psw.error = "Password Required"
                return@setOnClickListener
            }
        }

        open.setOnClickListener {
            val intent=Intent(this , MainActivity2::class.java)
            startActivity(intent)
        }

    }
}
