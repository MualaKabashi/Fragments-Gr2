package com.cacttus.fragments_gr2.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.cacttus.fragments_gr2.R
import com.cacttus.fragments_gr2.databinding.ActivityMainBinding
import com.cacttus.fragments_gr2.fragments.FragmentFirst
import com.cacttus.fragments_gr2.fragments.FragmentSecond

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var firstFragment = FragmentFirst()
        var secondFragment = FragmentSecond()


        binding.btnFirstFragment.setOnClickListener {
            setCurrentFragment(firstFragment)
        }

        binding.btnSecondFragment.setOnClickListener {
            setCurrentFragment(secondFragment)
        }


    }

    fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView, fragment)
        }.commit()
    }


}

