package com.young.gangame_keepcoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigationView.selectedItemId = R.id.action_deals
        navigationView.setOnNavigationItemSelectedListener {
            true
        }
    }
}
