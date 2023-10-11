package com.capston.capstondesign

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.capston.capstondesign.databinding.ActivityMainBinding
import android.view.View

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private  val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    private val image = View.OnClickListener {
        val intent = Intent(this, ImageActivity::class.java)
        startActivity(intent)
    }
    private val result = View.OnClickListener{
        val intent = Intent(this, ResultActivity::class.java)
        startActivity(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonCamera.setOnClickListener{
        }
        binding.buttonResult.setOnClickListener(result)
        Log.i("MainActivity", "onCreate")

        binding.buttonImage.setOnClickListener(image)
        Log.i("MainActivity", "onCreate")

        binding.buttonEnd.setOnClickListener(this)


    }


    override fun onClick(v: View?) {

    }
}