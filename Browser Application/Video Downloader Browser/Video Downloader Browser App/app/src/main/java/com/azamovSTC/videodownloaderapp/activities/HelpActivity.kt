package com.azamovSTC.videodownloaderapp.activities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import com.azamovSTC.videodownloaderapp.R
import com.azamovSTC.videodownloaderapp.helper.AdController

class HelpActivity : AppCompatActivity() {

    private var backBtn: ImageView? = null
    private var container: LinearLayout? = null
    private var okayBtn: LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        initViews()
        contentViews()
    }

    private fun initViews() {
        backBtn = findViewById(R.id.backBtn)
        container = findViewById(R.id.banner_container)
        okayBtn = findViewById(R.id.okayBtn)
    }

    @SuppressLint("SetTextI18n")
    private fun contentViews() {

        /*admob*/
        AdController.loadBannerAd(this@HelpActivity, container!!)
        AdController.loadInterAd(this@HelpActivity)

        backBtn!!.setOnClickListener {
            onBackPressed()
        }

        okayBtn!!.setOnClickListener {
            onBackPressed()
        }

    }

    override fun onBackPressed() {
        AdController.adCounter++
        if (AdController.adCounter == AdController.adDisplayCounter) {
            AdController.showInterAd(this@HelpActivity, null, 0)
        } else {
            super.onBackPressed()
        }
    }

}