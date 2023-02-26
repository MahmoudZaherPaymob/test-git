package com.paymob.gitflowcycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //add comment to test feature branch
        // new comment to the same feature
        test()
    }

    fun test(): String {
        return "test"
    }
}