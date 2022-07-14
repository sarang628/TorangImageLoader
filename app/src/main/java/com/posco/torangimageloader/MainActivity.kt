package com.posco.torangimageloader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.posco.torangimageloader.databinding.ActivityMainBinding
import com.sarang.torangimageloader.ImageLoadBindingAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.url = "http://talkimg.imbc.com/TVianUpload/tvian/TViews/image/2022/04/15/9bfc6b90-dc75-44c2-b9f8-7a4d89aa6fef.jpg"
    }
}