package com.jgeun.mvphilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jgeun.mvphilt.databinding.ActivityMainBinding
import com.jgeun.mvphilt.home.HomeFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

	private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		val fragmentManager = supportFragmentManager
		fragmentManager.beginTransaction()
			.add(R.id.fragment_container, HomeFragment.newInstance())
			.commit()
	}
}