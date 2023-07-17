package com.coding.meet.bottomnavigationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ListOfBottomNavigationButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_of_bottom_navigation_button)

        val simBNBBtn = findViewById<Button>(R.id.simBNBBtn)
        simBNBBtn.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

        val pinBNBBtn = findViewById<Button>(R.id.pinBNBBtn)
        pinBNBBtn.setOnClickListener {
            startActivity(Intent(this,PinterestActivity::class.java))
        }

        val fabWithBNBBtn = findViewById<Button>(R.id.fabWithBNBBtn)
        fabWithBNBBtn.setOnClickListener {
            startActivity(Intent(this,FabWithBottomActivity::class.java))
        }

        val colorBNBBtn = findViewById<Button>(R.id.colorBNBBtn)
        colorBNBBtn.setOnClickListener {
            startActivity(Intent(this,ColorBottomActivity::class.java))
        }
    }
}