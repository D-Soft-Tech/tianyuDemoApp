package com.pepsa.netpospaymentapp.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pepsa.netpospaymentapp.R
import com.whty.smartpos.tysmartposapi.ITYSmartPosApi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tianyuApi = ITYSmartPosApi.get(applicationContext)
    }
}
