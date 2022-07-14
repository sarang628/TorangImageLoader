package com.sarang.torangimageloader

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

object ImageLoadBindingAdapter {
    @JvmStatic
    @BindingAdapter("loadImage")
    fun loadImage(imageView: ImageView, url: String?) {
        if (url == null) {
            imageView.setImageResource(0)
            return
        }

        val circularProgressDrawable = CircularProgressDrawable(imageView.context)
        circularProgressDrawable.strokeWidth = 5f
        circularProgressDrawable.centerRadius = 30f
        circularProgressDrawable.start()
        Glide.with(imageView.context)
            .load(url)
            .centerCrop() //                .placeholder(circularProgressDrawable)
            .into(imageView)
    }

    @JvmStatic
    @BindingAdapter("loadCircleImage")
    fun loadCircleImage(imageView: ImageView, url: String?) {
        if (url == null) {
            return
        }
        val circularProgressDrawable = CircularProgressDrawable(imageView.context)
        circularProgressDrawable.strokeWidth = 5f
        circularProgressDrawable.centerRadius = 30f
        circularProgressDrawable.start()
        Glide.with(imageView.context).load(url)
            .apply(RequestOptions.circleCropTransform())
            .placeholder(circularProgressDrawable)
            .into(imageView)
    }

    @JvmStatic
    @BindingAdapter("loadProfileImage")
    fun loadProfileImage(imageView: ImageView, url: String?) {
        if (url == null) {
            Glide.with(imageView.context).load(R.drawable.profile_holder)
                .into(imageView)
            return
        }
        val circularProgressDrawable = CircularProgressDrawable(imageView.context)
        circularProgressDrawable.strokeWidth = 5f
        circularProgressDrawable.centerRadius = 30f
        circularProgressDrawable.start()
        Glide.with(imageView.context).load(url)
            .apply(RequestOptions.circleCropTransform())
            .placeholder(circularProgressDrawable)
            .into(imageView)
    }

    @JvmStatic
    @BindingAdapter("loadReviewImage")
    fun loadReviewImage(imageView: ImageView, url: String?) {
        if (url == null) {
            imageView.setImageResource(0)
            return
        }
        val baseUrl = "http://sarang628.iptime.org:91/review_images/"
        val circularProgressDrawable = CircularProgressDrawable(imageView.context)
        circularProgressDrawable.strokeWidth = 5f
        circularProgressDrawable.centerRadius = 30f
        circularProgressDrawable.start()
        Glide.with(imageView.context)
            .load(baseUrl + url)
            .centerCrop()
            .placeholder(circularProgressDrawable)
            .into(imageView)
    }
}