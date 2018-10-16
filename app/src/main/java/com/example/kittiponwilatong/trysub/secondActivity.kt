package com.example.kittiponwilatong.trysub

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.activity_second.*

class secondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        startGameBtn.setOnClickListener {
            val intentToSelectGame = Intent(this,selectGameActivity::class.java)
            startActivity(intentToSelectGame)
        }

        profileBtn.setOnClickListener {
            val intentToProfile = Intent(this,ProfileActivity::class.java)
            startActivity(intentToProfile)
        }

        highScoreBtn.setOnClickListener {
            val intentToHighScore = Intent(this,HighScoreActivity::class.java)
            startActivity(intentToHighScore)
        }

        exitAppBtn.setOnClickListener {
            finishAffinity()
        }
    }
}
