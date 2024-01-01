package com.michael.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.michael.activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    private val rootView = this@MainActivity.findViewById(android.R.id.content)

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        toast("onCreate Activity")

        binding.gotoScrollingActivityButton.setOnClickListener {
            /*val explicitIntent = Intent(this, ScrollingActivity::class.java)
            startActivity(explicitIntent)*/
            Intent(this, ScrollingActivity::class.java).also { startActivity(it) }
        }

    }

    override fun onStart() {
        super.onStart()
        toast("onStart Activity")
    }

    override fun onResume() {
        super.onResume()
        toast("onResume Activity")
    }

    override fun onPause() {
        super.onPause()
        toast("onPause Activity")
    }

    override fun onStop() {
        super.onStop()
        toast("onStop Activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        toast("onDestroy Activity")
    }

    private fun toast(message: String) {
        Toast.makeText(this@MainActivity, message, Toast.LENGTH_SHORT).show()
    }

    /*private fun snackBar(message: String) {
        Snackbar.make(this@MainActivity.findViewById(android.R.id.content), message, Snackbar.LENGTH_SHORT).show()
    }*/
}