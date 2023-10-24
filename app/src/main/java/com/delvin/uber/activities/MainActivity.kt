package com.delvin.uber.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import com.delvin.uber.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var biding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        biding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(biding.root)
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        biding.btnRegister.setOnClickListener{goToRegister()}
        biding.btnLogin.setOnClickListener{login()}

    }

    private fun login() {
        val email = biding.textFieldEmail.text.toString()
        val password = biding.textFieldPassword.text.toString()

        if (isValidFor(email,password)){
            Toast.makeText(this, "Formulario valido", Toast.LENGTH_SHORT).show()
        }

    }

    private fun isValidFor(email: String, password:String): Boolean{

        if (email.isEmpty()){
            Toast.makeText(this, "Ingresa tu correo eléctronico", Toast.LENGTH_SHORT).show()
            return false
        }
        if (password.isEmpty()){
            Toast.makeText(this, "Ingresa tu contraseña", Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }

    private fun goToRegister(){
        val i = Intent(this, RegisterActivity::class.java)
        startActivity(i)
    }
}