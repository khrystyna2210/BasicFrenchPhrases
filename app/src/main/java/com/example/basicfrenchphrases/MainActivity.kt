package com.example.basicfrenchphrases

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    fun clickSound(view:View){
        mediaPlayer = MediaPlayer.create(this, resources.getIdentifier(view.getTag().toString(),"raw",packageName))
        mediaPlayer.start()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}