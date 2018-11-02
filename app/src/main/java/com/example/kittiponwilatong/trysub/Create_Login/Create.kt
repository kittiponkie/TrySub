package com.example.kittiponwilatong.trysub.Create_Login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kittiponwilatong.trysub.R
import kotlinx.android.synthetic.main.activity_create.*

class Create : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)

        CancelBtn.setOnClickListener {
            finish()
        }
    }
}
