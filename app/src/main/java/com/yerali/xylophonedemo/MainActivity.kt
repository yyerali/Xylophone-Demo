package com.yerali.xylophonedemo

import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yerali.xylophonedemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        enableEdgeToEdge()
        setContentView(binding.root)
        // 100% есть метод поэффективнее но ладно допустим
        val c = MediaPlayer.create(this, R.raw.c)
        val d = MediaPlayer.create(this, R.raw.d)
        val e = MediaPlayer.create(this, R.raw.e)
        val f = MediaPlayer.create(this, R.raw.f)
        val g = MediaPlayer.create(this, R.raw.g)
        val a = MediaPlayer.create(this, R.raw.a)
        val b = MediaPlayer.create(this, R.raw.b)

        binding.c2.setOnClickListener {
            c.start()
        }
        binding.d.setOnClickListener {
            d.start()
        }
        binding.e.setOnClickListener {
            e.start()
        }
        binding.f.setOnClickListener {
            f.start()
        }
        binding.g.setOnClickListener {
            g.start()
        }
        binding.a.setOnClickListener {
            a.start()
        }
        binding.b.setOnClickListener {
            b.start()
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}