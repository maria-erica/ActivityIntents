package com.example.activityintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import android.widget.Toast
import java.util.*

class TaskActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)

        findViewById<Button>(R.id.buttonExplore).setOnClickListener { buttonExplore() }
        findViewById<Button>(R.id.buttonGallery).setOnClickListener { buttonGallery() }
        findViewById<Button>(R.id.buttonRestaurant).setOnClickListener { buttonRestaurant() }
        findViewById<Button>(R.id.buttonNews).setOnClickListener { buttonNews() }
        findViewById<Button>(R.id.buttonTimer).setOnClickListener { Timer() }

    }
     private fun buttonExplore() {
        val uri = Uri.parse("https://www.lonelyplanet.com/greece/attractions")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)

     }
     private fun buttonGallery() {
            val uri = Uri.parse("https://www.planetware.com/pictures/greece-gr.htm")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)

     }
     private fun buttonRestaurant() {
        val uri = Uri.parse("https://traveltriangle.com/blog/restaurants-in-greece/")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)

     }
     private fun buttonNews() {
        val uri = Uri.parse("https://www.newsnow.co.uk/h/World+News/Europe/Southern+Europe/Greece")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)

     }
     private fun buttonBrowse() {
        val uri = Uri.parse("https://www.google.com/")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)


    }
    private fun Timer(){
        val intent = Intent(AlarmClock.ACTION_SHOW_TIMERS)
        intent.addCategory(Intent.CATEGORY_APP_MESSAGING)
        if (intent.resolveActivity(packageManager) != null){
        }else{
            Toast.makeText(this,"Cannot open TIMER", Toast.LENGTH_SHORT).show()
        }
    }
}
