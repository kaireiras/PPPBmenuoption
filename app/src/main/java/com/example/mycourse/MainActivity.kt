package com.example.mycourse

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mycourse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){

        }

    }

    // function untuk menampilkan menu dalam action bar
    // untuk aktiviti terkait / this
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // setting dan load menu
         menuInflater.inflate(R.menu.menu_option, menu)
        // kasih tau aktifiti bahwa ada menu yang ingin ditampilkan
        return true

    }
    // function untuk menghandle jika menu di pilih oleh user
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.action_home -> {
                //action untuk materi
                // buat navigasi ke activity baru (materi activity
                Toast.makeText(this@MainActivity, "Home menu selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_materi -> {
                Toast.makeText(this@MainActivity, "Materi sudah terselect", Toast.LENGTH_SHORT).show()
                var IntentToActionMateri = Intent(this@MainActivity, MateriActivity::class.java)
                startActivity(IntentToActionMateri)
                true
            }
            R.id.action_quiz -> {
                Toast.makeText(this@MainActivity,"Quiz sudah terselect", Toast.LENGTH_SHORT).show()
                var IntentToActionQuiz = Intent(this@MainActivity, QuizActivity::class.java)
                startActivity(IntentToActionQuiz)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}