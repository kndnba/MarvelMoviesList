package com.bignerdranch.android.marvelmovieslist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class BioActivity : AppCompatActivity() {
    private lateinit var bioTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bio)
        val bioText = intent.extras?.get("bio")
        bioTextView = findViewById(R.id.text_bio)
        bioTextView.text = bioText as CharSequence?
    }
}