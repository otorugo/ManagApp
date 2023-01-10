package com.example.manag

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import com.example.manag.databinding.ActivityIntroBinding
import com.example.manag.ui.auth.SignUpActivity

class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
        )

//        val buttonSignUp = findViewById<Button>(R.id.signup_button)
        val binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.signupButton.setOnClickListener {
            val intent = Intent(this@IntroActivity, SignUpActivity::class.java)
            startActivity(intent)
        }

    }


}