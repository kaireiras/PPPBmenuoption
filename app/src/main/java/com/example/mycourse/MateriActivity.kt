package com.example.mycourse

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mycourse.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MateriActivity : AppCompatActivity() {

    companion object{
        @StringRes
        private val TAB_TITLE = intArrayOf(
            R.string.tab_text_1,
            R.string.tab_text_2
        )
    }

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var sectionsPagerAdapter = SectionsPagerAdapter(this)

        with(binding) {
            viewPager.adapter = sectionsPagerAdapter

            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                tab.text = resources.getString(TAB_TITLE[position])
            }.attach()
            supportActionBar?.elevation = 0f

//            btnMateri1.setOnClickListener{
//
//            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_option, menu)
        return true
    }

    fun generateDummy(): List<Materi>{
        return listOf(
            Materi(judulMateri = "materi", deskripsiMateri = "blabalbalbalba", tglMateri = 2),
            Materi(judulMateri = "cara menaklukkan milan", deskripsiMateri = "susah bos", tglMateri = 29),
            Materi(judulMateri = "cara menaklukkan mu", deskripsiMateri = "udah ancur", tglMateri = 25),
            Materi(judulMateri = "bismillah", deskripsiMateri = "bismillah bisa", tglMateri = 9),
            Materi(judulMateri = "asdasd", deskripsiMateri = "asasdasd", tglMateri = 4),
            Materi(judulMateri = "asdlajjd", deskripsiMateri = "aljshalsjdhajklsh", tglMateri = 2),
            Materi(judulMateri = "asdjlakjsdlaskdj", deskripsiMateri = "alksdjalksdj", tglMateri = 8),
            Materi(judulMateri = "cara menaklukkan barca", deskripsiMateri = "jangan", tglMateri = 3),
            Materi(judulMateri = "cara buat mie ayam", deskripsiMateri = "masukkan royko", tglMateri = 2),
            Materi(judulMateri = "jujur bingung", deskripsiMateri = "bingung", tglMateri = 4)


            )
    }

}