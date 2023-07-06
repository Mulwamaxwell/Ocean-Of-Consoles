package com.example.oceanofconsoles

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.icu.text.Transliterator.Position
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.animation.Positioning

class FragmentActivity : AppCompatActivity() {
    lateinit var log:Button
    lateinit var mini:Button
    private lateinit var pager:ViewPager
    lateinit var ind1:TextView
    lateinit var ind2:TextView
    lateinit var ind3:TextView
    lateinit var activity : Activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        activity = this

        log = findViewById(R.id.next)
        mini = findViewById(R.id.skip)
        pager = findViewById(R.id.slider)
        ind1 = findViewById(R.id.indicator1)
        ind2 = findViewById(R.id.indicator2)
        ind3 = findViewById(R.id.indicator3)


        val adapter = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(Screen1(), "hello")
        adapter.addFragment(Screen2(), "welcome")
        adapter.addFragment(screen3(), "hello")

        pager.adapter = adapter

        mini.setOnClickListener {
            val start = Intent(this,loginActivity::class.java)
            startActivity(start)
        }
        log.setOnClickListener {
            pager.currentItem++
        }

        pager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                if (position == adapter.count - 1) {
                    log.text = "START"
                    log.setOnClickListener {
                        val go = Intent(this,loginActivity::class.java)
                        startActivity(go)
                        finish()
                    }
                } else {
                    log.text= "NEXT"
                    log.setOnClickListener {
                        pager.currentItem++
                    }
                }
                when (pager.currentItem) {
                    0 -> {
                        ind1.setTextColor(Color.RED)
                        ind2.setTextColor(Color.DKGRAY)
                        ind3.setTextColor(Color.DKGRAY)
                    }

                    1 -> {
                        ind1.setTextColor(Color.DKGRAY)
                        ind2.setTextColor(Color.RED)
                        ind3.setTextColor(Color.DKGRAY)
                    }

                    2 -> {
                        ind1.setTextColor(Color.DKGRAY)
                        ind2.setTextColor(Color.DKGRAY)
                        ind3.setTextColor(Color.RED)
                    }
                }
            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })
    }

    private fun Intent(
        onPageChangeListener: ViewPager.OnPageChangeListener,
        java: Class<loginActivity>
    ): Intent? {
        val intent=Intent(this,loginActivity::class.java)
        startActivity(intent)
        return TODO("Provide the return value")
    }

}