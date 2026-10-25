package org.amnezia.awg.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import org.amnezia.awg.R

class SplashActivity : AppCompatActivity() {

    private val handler = Handler(Looper.getMainLooper())

    private val openMainScreen = Runnable {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = resources.getColor(R.color.broline_black)
        window.navigationBarColor = resources.getColor(R.color.broline_black)

        setContentView(R.layout.activity_splash)

        handler.postDelayed(openMainScreen, 1000L)
    }

    override fun onDestroy() {
        handler.removeCallbacks(openMainScreen)
        super.onDestroy()
    }
}
