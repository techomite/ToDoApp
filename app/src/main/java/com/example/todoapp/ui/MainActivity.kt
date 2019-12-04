package com.example.todoapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.todoapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setting up the nav controller from main xml file
        val navController = Navigation.findNavController(this,R.id.fragment)
        NavigationUI.setupActionBarWithNavController(this, navController)

         }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(
            Navigation.findNavController(this,R.id.fragment), null)
    }
}
