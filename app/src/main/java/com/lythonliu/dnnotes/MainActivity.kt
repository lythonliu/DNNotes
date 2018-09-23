package com.lythonliu.dnnotes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : com.lythonliu.LinkAppCompatActivity() {
    override
    fun getAppName():String{
        return BuildConfig.APP_NAME
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
