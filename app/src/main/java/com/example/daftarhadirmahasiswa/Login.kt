package com.example.daftarhadirmahasiswa

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editTextEmail = findViewById<EditText>(R.id.editTextEmailAddress)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

//        lamba function
        buttonLogin.setOnClickListener {
            val email : String = editTextEmail.text.toString()


            val intentLogin = Intent(this, MainActivity::class.java)
            intentLogin.putExtra(KEY_USERNAME, email)
            startActivity(intentLogin)

            Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
        }
//        interface
//        buttonLogin.setOnClickListener(this)
    }

    companion object{
        const val KEY_USERNAME: String = "username"
    }

//    override fun onClick(v: View?) {
//        Toast.makeText(this, "Button Clicked via interface", Toast.LENGTH_SHORT).show()
//    }
}