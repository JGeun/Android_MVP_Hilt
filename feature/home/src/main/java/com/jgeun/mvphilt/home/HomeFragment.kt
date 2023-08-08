package com.jgeun.mvphilt.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jgeun.mvphilt.home.adapter.PersonAdapter
import com.jgeun.mvphilt.home.databinding.FragmentHomeBinding
import com.jgeun.mvphilt.home.presenter.HomeContract
import com.jgeun.mvphilt.home.presenter.HomePresenter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment(), HomeContract.View {

	private var _binding: FragmentHomeBinding? = null
	private val binding get() = _binding!!

	@Inject
	lateinit var homePresenter: HomePresenter
	private val personAdapter by lazy { PersonAdapter() }

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		_binding = FragmentHomeBinding.inflate(inflater, container, false)
		return binding.root
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		initPresenter()

		binding.adapter = personAdapter
	}

	override fun onDestroyView() {
		super.onDestroyView()
		homePresenter.detachView()
		_binding = null
	}

	private fun initPresenter() {
		homePresenter.attachView(this)
		homePresenter.setPersonAdapterModel(personAdapter)
		homePresenter.setPersonAdapterView(personAdapter)
	}

	companion object {
		fun newInstance() = HomeFragment()
	}
}