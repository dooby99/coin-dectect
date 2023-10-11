package com.capston.capstondesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import com.capston.capstondesign.databinding.ActivityImageBinding
import com.capston.capstondesign.databinding.ActivityMainBinding

class ImageActivity : AppCompatActivity() {
    private val binding by lazy { ActivityImageBinding.inflate(layoutInflater) }

    private val requestPhoto =
        registerForActivityResult(ActivityResultContracts.GetContent()){
            binding.imageViewPhoto.setImageURI(it)
        }

    private val result = View.OnClickListener{
        val intent = Intent(this, ResultActivity::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonCancel.setOnClickListener{

        }

        binding.buttonPhoto.setOnClickListener{
            requestPhoto.launch("image/*")
        }

        binding.buttonComfirm.setOnClickListener(result)
        Log.i("MainActivity", "onCreate")
    }
}