package com.example.kittiponwilatong.trysub

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_high_score.*

class HighScoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_high_score)

        ExitHighBtn.setOnClickListener {
            val intentsecondActivity = Intent(this,secondActivity::class.java)
            startActivity(intentsecondActivity)
        }
    }
}
