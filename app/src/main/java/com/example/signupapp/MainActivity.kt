package com.example.signupapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.signupapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //binding
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        //on button click
        binding.btnSignup.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val fullname = binding.etFullname.text.toString()
            val username = binding.etUsername.text.toString()
            val password = binding.etPassword.text.toString()

            //toast user input data
            if (email.isEmpty() || fullname.isEmpty() || username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Mohon isi semua data terlebih dahulu", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Email: $email " +
                        "Fullname: $fullname\n" +
                        "Username: $username " +
                        "Password: $password", Toast.LENGTH_SHORT).show()
            }
        }


    }
}