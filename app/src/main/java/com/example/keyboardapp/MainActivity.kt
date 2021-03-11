package com.example.keyboardapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class MainActivity : AppCompatActivity(){

    private lateinit var rvKeyboard:RecyclerView
    private var list: ArrayList<Keyboard> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvKeyboard = findViewById(R.id.rv_keyboard)
        rvKeyboard.setHasFixedSize(true)

        list.addAll(KeyboardData.listData)
        showRecycleList()

        val actionbar = supportActionBar
        actionbar!!.title= "Home"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        getMenuInflater().inflate(R.menu.mymenu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.getItemId()
        if (id == R.id.bt_profile){
            val profile = Intent(this@MainActivity,activity_profile::class.java)
            startActivity(profile)
        }

        else if(id == R.id.share){
            val dialPhoneIntent = Intent(Intent.ACTION_SEND)
            dialPhoneIntent.putExtra(Intent.EXTRA_TEXT,"Hallo tolong Share ke Social Media")
            dialPhoneIntent.setType("text/plain")
            startActivity(Intent.createChooser(dialPhoneIntent,"Share to"))

        }
        return super.onOptionsItemSelected(item)
    }

    private fun showRecycleList(){
        rvKeyboard.layoutManager = LinearLayoutManager(this)
        val listKeyboardAdapter = ListKeyboardAdapter(list)
        rvKeyboard.adapter = listKeyboardAdapter
    }
}

