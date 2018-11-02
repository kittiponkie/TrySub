package com.example.kittiponwilatong.trysub

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.activity_profile.view.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        exitProBtn.setOnClickListener {
            val intentsecondActivity = Intent(this,secondActivity::class.java)
            startActivity(intentsecondActivity)
        }

        imageUserView.setImageResource(R.drawable.vatar)


    }
}
