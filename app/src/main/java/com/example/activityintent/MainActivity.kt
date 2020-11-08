package com.example.activityintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //login button
        findViewById<Button>(R.id.buttonSignup).setOnClickListener { buttonSignUp() }
        findViewById<Button>(R.id.buttonLogin).setOnClickListener {
            val usernameText = findViewById<EditText>(R.id.inputName)
            val username = usernameText.text.toString();

            val passwordText = findViewById<EditText>(R.id.inputPassword)
            val password = passwordText.text.toString();

            if (username.equals("Maria") && password.equals("erica")) {
                LoginPage()

            } else {
                Toast.makeText(this, "Incorrect username or password.", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun LoginPage() {
        val intent = Intent(this, TaskActivity::class.java)
        startActivity(intent)
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
    }
    private fun buttonSignUp() {
        val intent = Intent(this, TaskActivity::class.java)
        startActivity(intent)
        Toast.makeText(this, "You are logged in", Toast.LENGTH_SHORT).show()

    }
}