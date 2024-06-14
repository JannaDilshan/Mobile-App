package com.example.emart

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.emart.databinding.ActivitySignInBinding




class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<Button>(R.id.Button1)
        textView.setOnClickListener {
            val SignInActivity = Intent(this, SignInActivity::class.java)
            startActivity(SignInActivity)


        }


    }
}


