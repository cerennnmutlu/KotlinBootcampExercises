package com.cerennnmutlu.spotifyapp

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SongsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_songs)

        findViewById<ImageButton>(R.id.backButton).setOnClickListener {
            finish()
        }

        val songsRecyclerView = findViewById<RecyclerView>(R.id.songsRecyclerView)
        songsRecyclerView.layoutManager = LinearLayoutManager(this)

        // Örnek şarkı verileri
        val songs = listOf(
            Song(1, "Shape of You", "Ed Sheeran", "3:53", "https://i.scdn.co/image/ab67616d0000b273ba5db46f4b838ef6027e6f96", "Pop"),
            Song(2, "Blinding Lights", "The Weeknd", "3:20", "https://i.scdn.co/image/ab67616d0000b2738863bc11d2aa12b54f5aeb36", "Pop"),
            Song(3, "Dance Monkey", "Tones and I", "3:29", "https://i.scdn.co/image/ab67616d0000b2732e8ed79e177ff6011076f5f5", "Pop"),
            Song(4, "Someone You Loved", "Lewis Capaldi", "3:02", "https://i.scdn.co/image/ab67616d0000b2732e8ed79e177ff6011076f5f5", "Pop"),
            Song(5, "Bad Guy", "Billie Eilish", "3:14", "https://i.scdn.co/image/ab67616d0000b2732e8ed79e177ff6011076f5f5", "Pop"),
            Song(6, "Rockstar", "Post Malone", "3:38", "https://i.scdn.co/image/ab67616d0000b2732e8ed79e177ff6011076f5f5", "Hip-Hop"),
            Song(7, "Old Town Road", "Lil Nas X", "2:37", "https://i.scdn.co/image/ab67616d0000b2732e8ed79e177ff6011076f5f5", "Hip-Hop"),
            Song(8, "Sunflower", "Post Malone & Swae Lee", "2:38", "https://i.scdn.co/image/ab67616d0000b2732e8ed79e177ff6011076f5f5", "Hip-Hop"),
            Song(9, "Without Me", "Halsey", "3:21", "https://i.scdn.co/image/ab67616d0000b2732e8ed79e177ff6011076f5f5", "Pop"),
            Song(10, "Circles", "Post Malone", "3:35", "https://i.scdn.co/image/ab67616d0000b2732e8ed79e177ff6011076f5f5", "Pop")
        )

        songsRecyclerView.adapter = SongAdapter(songs)
    }
} 